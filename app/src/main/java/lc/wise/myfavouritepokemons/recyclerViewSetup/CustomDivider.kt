package lc.wise.myfavouritepokemons.recyclerViewSetup

import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.view.children
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView

class CustomDivider(private val dividerDrawable: Drawable) : RecyclerView.ItemDecoration() {
    private val dividerWidth = dividerDrawable.intrinsicWidth
    private val dividerHeight = dividerDrawable.intrinsicHeight

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        parent.adapter?.let { adapter ->
            val childAdapterPosition = parent.getChildAdapterPosition(view)
                .let { if (it == RecyclerView.NO_POSITION) return else it }
            outRect.bottom =
                if (childAdapterPosition == adapter.itemCount - 1) 0
                else dividerWidth
        }
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        parent.adapter?.let { adapter -> //the alternative variant fits in 3 strings
            parent.children.forEach { view -> //in PokemonList, but it adds another separator
                val childAdapterPosition = parent.getChildAdapterPosition(view)//at the end
                    .let { if (it == RecyclerView.NO_POSITION) return else it }
                if (childAdapterPosition != adapter.itemCount- 1) { //this one doesnt
                    val left = parent.paddingLeft
                    val top = view.bottom + view.marginBottom
                    val right = parent.width - parent.paddingLeft
                    val bottom = top + dividerHeight
                    dividerDrawable.bounds = Rect(left, top, right, bottom)
                    dividerDrawable.draw(c)
                }
            }
        }
    }
}