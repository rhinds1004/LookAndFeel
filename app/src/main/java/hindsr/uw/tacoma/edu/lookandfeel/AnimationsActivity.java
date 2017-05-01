package hindsr.uw.tacoma.edu.lookandfeel;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.animation.AnimatorInflater.loadAnimator;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
    }

    public void animateSpin(View view){
        AnimatorSet set = null;
        View v = findViewById(R.id.animate_me);

            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                    R.animator.rotate_and_spin);
        set.setTarget(v);
        set.start();
    }

    public void animateMove(View view){
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet)AnimatorInflater.loadAnimator(this, R.animator.move);
        set.setTarget(v);
        set.start();
    }

    public void animateFade(View view){
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet)AnimatorInflater.loadAnimator(this, R.animator.fade);
        set.setTarget(v);
        set.start();
    }

    public void animateRobsAnim(View view){
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet)AnimatorInflater.loadAnimator(this, R.animator.robsanim);
        set.setTarget(v);
        set.start();
    }
}
