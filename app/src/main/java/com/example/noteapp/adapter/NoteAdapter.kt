package com.example.noteapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.databinding.ItemNoteBinding
import com.example.noteapp.db.NoteEntity
import com.example.noteapp.ui.UpdateNoteActivity
import com.example.noteapp.utils.Constants.BUNDLE_NOTE_ID

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    private lateinit var binding: ItemNoteBinding
    private lateinit var context: Context

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: NoteEntity) {
            binding.apply {
                tvTitle.text = item.noteTitle
                tvDesc.text = item.noteDesc

                root.setOnClickListener {
                    val intent = Intent(context, UpdateNoteActivity::class.java)
                    intent.putExtra(BUNDLE_NOTE_ID, item.noteId)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        binding = ItemNoteBinding.inflate(layoutInflater, parent, false)
        context = parent.context
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount() = differ.currentList.size

    private val differCallback = object: DiffUtil.ItemCallback<NoteEntity>() {
        override fun areItemsTheSame(oldItem: NoteEntity, newItem: NoteEntity): Boolean {
            return oldItem.noteId == newItem.noteId
        }

        override fun areContentsTheSame(oldItem: NoteEntity, newItem: NoteEntity): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

}
