export default function userWelcome(users) {
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
      </div>
    `;
}
