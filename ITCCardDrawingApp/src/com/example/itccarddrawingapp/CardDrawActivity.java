package com.example.itccarddrawingapp;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class CardDrawActivity extends Activity implements OnClickListener {

	// UI components
	private Button drawButton;
	private ImageView cardImage;
	
	// Random object
	private final static Random random = new Random();
	
	// The card deck
	private final static int[] cardDeck = new int[] {	R.drawable.aa,	// A card resource
														R.drawable.a2,	// 2 card resource
														R.drawable.a3,	// 3 card resource
														R.drawable.a4,	// 4 card resource
														R.drawable.a5,	// ...
														R.drawable.a6,
														R.drawable.a7,
														R.drawable.a8,
														R.drawable.a9,
														R.drawable.a10,
														R.drawable.aj,	// J card resource
														R.drawable.aq,	// Q card resource
														R.drawable.ak};	// K card resource
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_card_draw);
		
		drawButton 	= (Button)findViewById(R.id.drawButton);
		cardImage	= (ImageView)findViewById(R.id.cardImage);
		
		drawButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		drawCard();
	}

	private void drawCard() {
		// Set the image resource to the one being taken randomly from the cardDeck resouces table.
		cardImage.setImageResource(cardDeck[random.nextInt(cardDeck.length)]);
		
	}
	
}
