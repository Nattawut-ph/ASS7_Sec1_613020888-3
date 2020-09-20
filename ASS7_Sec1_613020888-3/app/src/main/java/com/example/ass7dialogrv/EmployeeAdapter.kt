package layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assLab7dialogrv.R

class EmployeeAdapter(val item: List<Employees>, val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item :View = LayoutInflater.from(parent.context).inflate(R.layout.empitemlayout, parent, false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text ="Name : " + item[position].name
        holder.tvGender.text ="Gender : " + item[position].gender
        holder.tvMail.text ="E-Mail : " + item[position].mail
        holder.tvSalary.text ="Salary : " + item[position].salary.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}