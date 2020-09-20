package layout

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.empitemlayout.view.*

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvName = view.tv_name
    val tvGender = view.tv_gender
    val tvMail = view.tv_mail
    val tvSalary = view.tv_salary
}