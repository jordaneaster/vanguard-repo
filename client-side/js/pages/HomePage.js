import InspirationalQuote from "../components/InspirationalQuote";
import Header from "../components/Header";

export default function HomePage(users) {
  return `
  ${users.map((user) => {
    return `
    <p class="user-name">Hello, ${user.userName}</p>
    <input type='hidden' id='userId' value='${user.id}'>
    <div class="inspirational_quote_container"></div>
    `;
  })}
  `;
}
