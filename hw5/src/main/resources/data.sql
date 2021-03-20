insert into authors (name) values ( 'Jon Daw')
ON CONFLICT (name) DO NOTHING;
;
