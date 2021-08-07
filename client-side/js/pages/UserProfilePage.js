import IntakeMenu from "../rendering/IntakeMenu";
import intakemenu from "../rendering/IntakeMenu";
export default function userWelcome(users) {
  const intakemenu = new IntakeMenu();
  console.log(users);
  return `
  <div class="userClass">
    ${users
      .map((user) => {
        return `
      <div class="user_tile">
      <p class="userName">Welcome ${user.userName} !</p>
      <input type='hidden' id='userId' value='${user.id}'>
        `;
      })
      .join("")}
    `;
}
