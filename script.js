document.addEventListener('DOMContentLoaded', () => {
const elements = [
    document.querySelector('.header'),
    ...document.querySelectorAll('.card'),
    document.querySelector('.video-container')
].filter(Boolean);
const observer = new
IntersectionObserver((entries, obs) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add('in-view');
            obs.unobserve(entry.target);
        }
    });
}, {
    rootMargin: '0px 0px -40px 0px',
    threshold: 0.1
});
elements.forEach((element) => {
    element.classList.add('animate-item');
    if (element.classList.contains('card')) {
        const cardIndex = Array.from(document.querySelectorAll('.card')).indexOf(element);
        element.style.transitionDelay = `${cardIndex * 120}ms`;
    }
    observer.observe(element);
});
});