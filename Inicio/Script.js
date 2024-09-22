let currentIndex = 0;
const images = [
    '../Images/Proyecto_Robotica.jpg',
    '../Images/Proyecto_Software.jpg',
];

function changeImage(direction) {
    const imgElement = document.getElementById('gallery-image');

    imgElement.classList.add('fade-out'); 

    setTimeout(() => {
        currentIndex = (currentIndex + direction + images.length) % images.length;
        imgElement.src = images[currentIndex];
        imgElement.classList.remove('fade-out'); 
        updateProgressDots(); 
    }, 500); 
}

function updateProgressDots() {
    const dots = document.querySelectorAll('.dot');
    dots.forEach((dot, index) => {
        dot.classList.toggle('active', index === currentIndex);
    });
}

document.addEventListener('DOMContentLoaded', () => {
    updateProgressDots();
    setInterval(() => changeImage(1), 5000); 
});
