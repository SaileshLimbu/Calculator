package np.com.softwarica.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnPlus, btnMinus, btnMultiply, btnDivide, btnReset, btnCalc;
    private TextView tvResult;
    private String operation;
    private int firstNum = -1, secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnReset = findViewById(R.id.btnReset);
        btnCalc = findViewById(R.id.btnCalculate);

        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlus:
                operation = "+";
                tvResult.setText(tvResult.getText().toString() + " + ");
                break;
            case R.id.btnMinus:
                operation = "-";
                tvResult.setText(tvResult.getText().toString() + " - ");
                break;
            case R.id.btnMultiply:
                operation = "x";
                tvResult.setText(tvResult.getText().toString() + " x ");
                break;
            case R.id.btnDivide:
                operation = "%";
                tvResult.setText(tvResult.getText().toString() + " % ");
                break;
            case R.id.btnReset:
                tvResult.setText("0");
                firstNum = -1;
                break;
            case R.id.btnCalculate:
                switch (operation) {
                    case "+":
                        int sum = firstNum + secondNum;
                        tvResult.setText(tvResult.getText().toString() + " = " + sum);
                        break;
                    case "-":
                        int sub = firstNum - secondNum;
                        tvResult.setText(tvResult.getText().toString() + " = " + sub);
                        break;
                    case "x":
                        int mul = firstNum * secondNum;
                        tvResult.setText(tvResult.getText().toString() + " = " + mul);
                        break;
                    case "%":
                        int divide = firstNum / secondNum;
                        tvResult.setText(tvResult.getText().toString() + " = " + divide);
                        break;
                }
                break;
            default:
                int num = Integer.parseInt(((Button) v).getText().toString());
                if (firstNum == -1) {
                    firstNum = num;
                    tvResult.setText(Integer.toString(firstNum));
                } else {
                    secondNum = num;
                    tvResult.setText(tvResult.getText().toString() + secondNum);
                }
                break;
        }
    }
}
