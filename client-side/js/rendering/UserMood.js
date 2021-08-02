export default function UserMood(mood) {
  return `
    ${mood.map((userMood) => {
      return `
        ${userMood}
        `;
    })}
    `;
}
