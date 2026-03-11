let currentIndex = 0;
const slides = document.getElementById("slides");
const dots = document.querySelectorAll(".dot");
const totalSlides = dots.length;

function updateSlider() {
    slides.style.transform = `translateX(-${currentIndex * 100}%)`;

    dots.forEach((dot, index) => {
        dot.classList.toggle("active", index === currentIndex);
    });
}

function moveSlide(step) {
    currentIndex += step;

    if (currentIndex >= totalSlides) {
        currentIndex = 0;
    }

    if (currentIndex < 0) {
        currentIndex = totalSlides - 1;
    }

    updateSlider();
}

function goToSlide(index) {
    currentIndex = index;
    updateSlider();
}

setInterval(() => {
    moveSlide(1);
}, 4000);