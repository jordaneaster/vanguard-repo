export default function InboxPage(messages) {
  return `
  <div class='myInbox'>
  ${messages.map((message) => {
    return `
      <div class="inbox">
      <p class="content">${message.subject}</p>
      <p class="subject">${message.title}</p> 
      <p class="subject">${message.content}</p>
      </div>
      `;
  })}
  </div>
  
    `;
}
