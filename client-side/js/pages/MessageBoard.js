export default function MessageBoard(messages) {
  return `
  <h1>Message Board</h1>
    <div class="messageBoard">
    ${messages
      .map((post) => {
        return `
      <div class="messageBoardTable">
          <p class="subject">${post.subject}</p>
          <p class="title">${post.title}</p>
          <p class="post">${post.content}</p>
      <div class="reply">
          <input type="text" class="replyTitle" placeholder="Reply Title">
          <input type="text" class="replySubject" placeholder="Reply Subject">
          <input type="text" class="replyContent" placeholder="Reply Content">
          <button class="replyButton">Reply</button>
      <div class="assessmentMenu">
      <select name="cbtMood" id="assessMood" class="intakeMood">
          <option value="userMood" class="cbt1">To Feel..</option>
          <option value="Happy" class="cbt2">Happy</option>
          <option value="Satisfied" class="cbt3">Satisfied</option>
          <option value="Calm" class="cbt4">Calm</option>
          <option value="Forgiving" class="cbt5">Forgiving</option>
          <option value="Proud" class="cbt6">Proud</option>
      </select>
      <select name="userCoping" id="assessCoping" class="intakeCoping">
          <option value="userCoping" class="cbt">
            Try this instead...</option>
          <option value="Positive Self-Talk" class="cbt">Positive Self-Talk</option>
          <option value="Reflection" class="cbt">Reflection</option>
          <option value="Exercise" class="cbt">Exercise</option>
          <option value="Positive Friends" class="cbt">Positive Friends</option>
          <option value="Engage in Spirituality" class="cbt">Engage in Spirituality</option>
          <option value="Clean/Organize" class="cbt">Clean/Organize</option>
          <option value="Set Boundaries" class="cbt">Set Boundaries</option>
          <option value="Gratitude List" class="cbt">Gratitude List</option>
          <option value="Prioritize Tasks" class="cbt">Prioritize Tasks</option>
      </select>
          <button class="assessBtn">Send Response</button>
      </div>
          <input type='hidden' id='profileId' value='${post.id}'>
     </div>
       
        `;
      })
      .join("")}
    </div> 
    </div>   
    `;
}
