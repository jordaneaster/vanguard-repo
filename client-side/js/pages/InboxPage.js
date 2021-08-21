import "../../css/inbox.css"
import picture from "../../images/vhs-logo-gray.png"
import logo from "../../images/hr-logo-heart.png"
export default function InboxPage(reply) {
  return `
  <div class='myInbox'>
  <aside class="messageAside">
  <img src="${picture}">
  <img src="${logo}">
  </aside>
  ${reply
    .map((replies) => {
      return `
      <i class="fa fa-envelope-square" style="font-size:24px;color:red">New Message!</i>
      <br>
     
      <div class="inbox">
      <p class="subject">${replies.subject}</p>
      <p class="title">${replies.title}</p> 
      <p class="content">${replies.content}</p>
      </div>
      `
      ;
    }) 
    .join("")}
  
  </div>
    `;
}

