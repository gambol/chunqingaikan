package com.actionbarsherlock.internal.widget; class IcsSpinner$DropdownPopup { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;
a=0;// .super Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// .source "IcsSpinner.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DropdownPopup"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field private mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p4, "defStyleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 644
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     .line 645
a=0;//     invoke-direct {p0, p2, p3, v1, p4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     .line 647
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 648
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setModal(Z)V
a=0;// 
a=0;//     .line 649
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setPromptPosition(I)V
a=0;// 
a=0;//     .line 650
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup$1;-><init>(Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup$1;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 657
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;)Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getHintText()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 666
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 661
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 662
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 663
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptText(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "hintText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 672
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 676
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 677
a=0;//     .local v2, "spinnerPaddingLeft":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     iget v5, v5, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 678
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 679
a=0;//     .local v4, "spinnerWidth":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 681
a=0;//     .local v3, "spinnerPaddingRight":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     check-cast v5, Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v5, v7}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 682
a=0;//     #v5=(Integer);
a=0;//     sub-int v6, v4, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v3
a=0;// 
a=0;//     .line 680
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     .line 690
a=0;//     .end local v3    # "spinnerPaddingRight":I
a=0;//     .end local v4    # "spinnerWidth":I
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 691
a=0;//     .local v0, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 692
a=0;//     .local v1, "bgOffset":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 693
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->access$0(Lcom/actionbarsherlock/internal/widget/IcsSpinner;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 694
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->access$0(Lcom/actionbarsherlock/internal/widget/IcsSpinner;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v1, v5
a=0;// 
a=0;//     .line 696
a=0;//     :cond_0
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     add-int v5, v1, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setHorizontalOffset(I)V
a=0;// 
a=0;//     .line 697
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 698
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->show()V
a=0;// 
a=0;//     .line 699
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ListView;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ListView;->setChoiceMode(I)V
a=0;// 
a=0;//     .line 700
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setSelection(I)V
a=0;// 
a=0;//     .line 701
a=0;//     return-void
a=0;// 
a=0;//     .line 683
a=0;//     .end local v0    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "bgOffset":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Byte);v7=(Uninit);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     iget v5, v5, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     .line 684
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 685
a=0;//     .restart local v4    # "spinnerWidth":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 686
a=0;//     .restart local v3    # "spinnerPaddingRight":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v5, v4, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, v3
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 688
a=0;//     .end local v3    # "spinnerPaddingRight":I
a=0;//     .end local v4    # "spinnerWidth":I
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->this$0:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     iget v5, v5, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
