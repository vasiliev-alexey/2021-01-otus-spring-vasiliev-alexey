const tbBody = document.querySelector(".bookTable");

fetch('/api/books')
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        for (let i = 0; i < data.length; i++) {

            const tr = document.createElement('tr');
            const tdId = document.createElement('td');
            tdId.innerText = data[i].id;
            tdId.hidden = true;
            const tdTitle = document.createElement('td');
            tdTitle.innerText = data[i].title;
            const tdIsbn = document.createElement('td');
            tdIsbn.innerText = data[i].isbn;

            const tdEdit = document.createElement('td');
            const editBtn = document.createElement('a');
            const editImg = document.createElement('img');
            editImg.src = "./images/pencil.png";
            editBtn.append(editImg);
            editBtn.href = `book/edit?id=${data[i].id}`
            tdEdit.appendChild(editBtn);

            const tdRemove = document.createElement('td');
            const removeBtn = document.createElement('a');
            const removeImg = document.createElement('img');
            removeImg.src = "./images/delete.png";
            removeBtn.append(removeImg);
            removeBtn.href = `book/delete?id=${data[i].id}`
            tdRemove.appendChild(removeBtn);

            tr.append(tdId, tdTitle, tdIsbn, tdEdit, tdRemove)
            tbBody.appendChild(tr);
        }
    });