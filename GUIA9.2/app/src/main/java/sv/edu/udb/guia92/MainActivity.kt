package sv.edu.udb.guia92

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.border

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sv.edu.udb.guia92.ui.theme.Guia92Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message(author = "Miguel", body = "JetPack Compose"))
                }
            }
        }
    }
}
  data class Message(val author: String , val body:String)

    @Composable
    fun MessageCard(msg: Message) {
        Row (modifier = Modifier.padding(all = 8.dp)){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    //size
                    .size(40.dp)
                    //clip image to be shaped as a circle
                    .clip(CircleShape)
                    .border(1.5.dp,MaterialTheme.colorScheme.primary, CircleShape)
                )
                //add horizontal space between the image and the colum 
                Spacer(modifier = Modifier.width(8.dp))

            Column() {
                Text(
                    text = msg.author,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
                Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = msg.body,
                        modifier = Modifier.padding(all = 4.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )

            }
        }

    }
    @Preview
    @Composable
     fun PreviewMessageCard(){
        MaterialTheme{
            Surface {
                MessageCard(
                    msg = Message("Mikepro", "take a look a jetpack compoose")
                )
            }}
     }

