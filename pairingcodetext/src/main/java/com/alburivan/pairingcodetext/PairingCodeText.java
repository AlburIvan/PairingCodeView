package com.alburivan.pairingcodetext;

/*
* Copyright 2016 AlburIvan [Ivan Alberto Alburquerque Mejia]
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

/*
|--------------------------------------------------------------------------
| Comments template section
|--------------------------------------------------------------------------
|
| The following language lines are used during authentication for various
| messages that we need to display to the user. You are free to modify
| these language lines according to your application's requirements.
|
*/


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * (･_･)っ
 *  PairingCodeText is a custom EditText that on focus transforms into a per-character separated
 *  EditText to allow users to seamlessly input some pairing code.
 *
 *  @author Iván Alburquerque
 *  @version pct.alpha-v1
 */
public class PairingCodeText extends FrameLayout {

    /** Custom tag used by the PairingCodeText to output logging information. */
    protected final String DEBUG_TAG = PairingCodeText.class.getCanonicalName();



    private int WIDTH;
    private int HEIGHT;
    private Paint paint;


    /*
    |--------------------------------------------------------------------------
    | Default values
    |--------------------------------------------------------------------------
    |
    | The following language lines are used during compile execution. These
    | are the default values used along the different elements that
    | compose this custom time picker view.
    |
    */




    /*
    |--------------------------------------------------------------------------
    | Custom View Properties
    |--------------------------------------------------------------------------
    |
    | The following language lines are used during compile execution. These
    | are the principal properties that FlingTimePicker can adquire during
    | runtime execution.
    |
    */



    /**
     * Instantiates a new PairingCode field.
     *
     * @param context the context used to create this view
     */
    public PairingCodeText(Context context) {
        super(context);
    }
    /**
     * Instantiates a new PairingCode field.
     *
     * @param context the context used to create this view
     * @param attrs The attributes used to initialize fields
     */
    public PairingCodeText(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    /**
     * Instantiates a new PairingCode field.
     *
     * @param context The context used to create this view
     * @param attrs The attributes used to initialize fields
     * @param defStyle the default style attributes
     */
    public PairingCodeText(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }



    /**
     * Method that initializes this custom view's default values and sets listeners
     *
     * @param context The context used to create this view
     * @param attrs The attributes used to initialize fields
     */
    protected void initAttrs(final Context context, final AttributeSet attrs) {
        if (isInEditMode())
            return;


        final TypedArray typedArray =
                context.obtainStyledAttributes(attrs, R.styleable.PairingCodeText);



        try {

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            typedArray.recycle();
        }

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }
}
