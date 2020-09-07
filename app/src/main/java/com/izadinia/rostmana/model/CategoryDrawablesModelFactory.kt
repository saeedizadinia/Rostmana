package com.izadinia.rostmana.model

import com.izadinia.rostmana.R

//object CategoryDrawablesModelFactory {
/**
 * returns an [ArrayList] of [CategoryDrawablesModel] objects
 * from our drawables to populate the recyclerView.
 *
 * @return An [ArrayList] of [CategoryDrawablesModel]s
 */
fun getModels(): ArrayList<CategoryDrawablesModel> {
    val mModels = ArrayList<CategoryDrawablesModel>()
    mModels.add(CategoryDrawablesModel(R.drawable.tshirt))
    mModels.add(CategoryDrawablesModel(R.drawable.shirt_01))
    mModels.add(CategoryDrawablesModel(R.drawable.waistcoat))
    mModels.add(CategoryDrawablesModel(R.drawable.coat_01))
    mModels.add(CategoryDrawablesModel(R.drawable.hood_01))
    mModels.add(CategoryDrawablesModel(R.drawable.jacket_01))
    mModels.add(CategoryDrawablesModel(R.drawable.accessory_01))
    mModels.add(CategoryDrawablesModel(R.drawable.pants_01))
    mModels.add(CategoryDrawablesModel(R.drawable.socks_01))
    mModels.add(CategoryDrawablesModel(R.drawable.shoe_01))
    return mModels
}
//}