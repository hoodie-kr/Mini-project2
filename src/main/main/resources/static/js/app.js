function loadRamen(category) {
    fetch('/api/ramen/' + category)
        .then(response => response.json())
        .then(data => {
            const list = document.getElementById('ramen-list');
            list.innerHTML = '';
            data.forEach(ramen => {
                const item = document.createElement('div');
                item.className = 'ramen-item';
                item.innerHTML = `<strong>${ramen.name}</strong> - ${ramen.price}원`;
                list.appendChild(item);
            });
        });
}