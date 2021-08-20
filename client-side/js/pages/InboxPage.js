import TopImg from '../../images/Message_img.png'


export default function InboxPage(reply, newReply) {
  return `
  <img class="message__top" src="${TopImg}">
  <div class='myInbox'>
  ${reply
    .map((replies) => {
      return `
      <div class="inbox">
      <p class="subject">${replies.subject}</p>
      <p class="title">${replies.title}</p> 
      <p class="content">${replies.content}</p>
      </div>
      `
      ;
    }) 
    .join()}
  
  </div>
    `;
}

