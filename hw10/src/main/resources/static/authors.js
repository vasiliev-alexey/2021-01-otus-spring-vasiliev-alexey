const tbBody = document.querySelector(".authorsTable");

fetch('/api/author')
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        for (let i = 0; i < data.length; i++) {
            const tr = document.createElement('tr');
            const td = document.createElement('td');
            td.innerText = data[i].name;
            tr.appendChild(td)
            tbBody.appendChild(tr);
        }
    });