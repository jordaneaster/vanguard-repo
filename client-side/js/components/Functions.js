var hiddenDiv = document.querySelector(".responseDescriptions");
var moodButton = document.querySelector(".responseMood");
function showHiddenDiv() {
  hiddenDiv.style.display = "block";
}
function hideHiddenDiv() {
  hiddenDiv.style.display = "none";
}
moodButton.addEventListener("click", () => {
  showHiddenDiv();
  hideHiddenDiv();
});
