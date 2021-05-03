const path = require('path');
const webpack = require('webpack');

const HtmlWebpackPlugin = require('html-webpack-plugin');
const glob = require('glob');

const pagesGenre = glob.sync('pages/*.html');
const MiniCss = require('mini-css-extract-plugin');
const FileManagerPlugin = require('filemanager-webpack-plugin');

/*
 * We've enabled HtmlWebpackPlugin for you! This generates a html
 * page for you when you compile webpack, which will make you start
 * developing and prototyping faster.
 *
 * https://github.com/jantimon/html-webpack-plugin
 *
 */

module.exports = {
  mode: 'development',

  plugins: [
    new MiniCss({
      filename: 'style.css'
    }),
    new webpack.ProgressPlugin(),
    ...pagesGenre.map(
      (el) =>
        new HtmlWebpackPlugin({
          filename: el.replace(/^pages\//, ''),
          template: el,
          minify: false
        })
    ),

    new FileManagerPlugin(
      {
        events: {
          onStart: {
            delete: [

              {
                source: path.resolve('../resources/templates/*'),
                options: {
                  force: true
                }
              },
              {
                source: path.resolve('../resources/static/styles/*'),
                options: {
                  force: true
                }
              },
              {
                source: path.resolve('../resources/static/images/'),
                options: {
                  force: true
                }
              }

            ]
          },

          onEnd: {
            copy: [
              {
                source: 'dist/*.html',
                destination: path.resolve('../resources/templates/')
              },
              {
                source: path.resolve('dist/*.css'),
                destination: path.resolve('../resources/static/styles/')
              },
              {
                source: path.resolve('dist/images'),
                destination: path.resolve('../resources/static/images')
              },
            ]

          }
        }
      })


  ],

  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        include: [path.resolve(__dirname, 'src')],
        loader: 'babel-loader'
      },
      {
        test: /\.png/,
        use: {
          loader: 'url-loader'
        },
        include: [path.resolve(__dirname, 'src/img')]
      },

      {
        test: /\.(s*)css$/,
        use: [MiniCss.loader, 'css-loader', 'sass-loader']
      },

      {
        test: /\.css$/,
        use: [
          {
            loader: 'style-loader',
            options: {
              outputPath: path.resolve('../resources/', 'styles')
            }

          }, 'css-loader']

      },

      {
        test: /\.(png|jpe?g|gif|svg|jpg|ico)$/i,
        use: [
          {
            loader: 'file-loader',
            options: {
              name: '[name].[ext]',
              outputPath: 'images'
            }
          }
        ]
      }
    ]
  },

  devServer: {
    open: true,
    host: 'localhost',
    contentBase: path.join(__dirname, 'dist'),
    openPage: 'main.html',
    port: 5000
  }
};
