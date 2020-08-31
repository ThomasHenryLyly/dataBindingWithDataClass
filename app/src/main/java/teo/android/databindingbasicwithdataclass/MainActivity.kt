package teo.android.databindingbasicwithdataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import teo.android.databindingbasicwithdataclass.databinding.ActivityMainBinding
import teo.android.databindingbasicwithdataclass.dataclass.Student

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var student: Student = Student("Tuan", 20, "Viet Nam")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.student = student

            binding.apply {
                btnShow.setOnClickListener {
                    student?.name = edtInputName.text.toString()
                    student?.age = edtInputAge.text.toString().toInt()
                    student?.country = edtInputCountry.text.toString()
                    invalidateAll()
                }
            }


    }
}