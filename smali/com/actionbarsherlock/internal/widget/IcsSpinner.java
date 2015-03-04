package com.actionbarsherlock.internal.widget; class IcsSpinner { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// .super Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;
a=0;// .source "IcsSpinner.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MAX_ITEMS_MEASURED:I = 0xf
a=0;// 
a=0;// .field public static final MODE_DROPDOWN:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDisableChildrenWhenDisabled:Z
a=0;// 
a=0;// .field mDropDownWidth:I
a=0;// 
a=0;// .field private mGravity:I
a=0;// 
a=0;// .field private mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;// .field private mTempAdapter:Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;// .field private mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget v0, Lcom/actionbarsherlock/R$attr;->actionDropDownStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 98
a=0;//     #v6=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 101
a=0;//     sget-object v4, Lcom/actionbarsherlock/R$styleable;->SherlockSpinner:[I
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p1, p2, v4, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;);
a=0;//     invoke-direct {v2, p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;-><init>(Lcom/actionbarsherlock/internal/widget/IcsSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 107
a=0;//     .local v2, "popup":Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     .line 108
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     .line 106
a=0;//     #v5=(Byte);
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDropDownWidth:I
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 109
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 112
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     .line 111
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 113
a=0;//     .local v3, "verticalOffset":I
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setVerticalOffset(I)V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "horizontalOffset":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropdownPopup;->setHorizontalOffset(I)V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v4, 0x11
a=0;// 
a=0;//     invoke-virtual {v0, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mGravity:I
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDisableChildrenWhenDisabled:Z
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempAdapter:Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempAdapter:Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     invoke-interface {v4, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempAdapter:Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     .line 139
a=0;//     :cond_2
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/IcsSpinner;)Landroid/graphics/Rect;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private makeAndAddView(I)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-virtual {v2, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->get(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 319
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 321
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setUpChild(Landroid/view/View;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 333
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/view/View;);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 328
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, p1, v3, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 331
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setUpChild(Landroid/view/View;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 333
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setUpChild(Landroid/view/View;)V
a=0;//     .locals 11
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 347
a=0;//     .local v6, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v6=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 351
a=0;//     :cond_0
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, p1, v8, v6}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     .line 353
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->hasFocus()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {p1, v8}, Landroid/view/View;->setSelected(Z)V
a=0;// 
a=0;//     .line 354
a=0;//     iget-boolean v8, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDisableChildrenWhenDisabled:Z
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->isEnabled()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-virtual {p1, v8}, Landroid/view/View;->setEnabled(Z)V
a=0;// 
a=0;//     .line 359
a=0;//     :cond_1
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mHeightMeasureSpec:I
a=0;// 
a=0;//     .line 360
a=0;//     #v8=(Integer);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v9, v9, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 359
a=0;//     invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 361
a=0;//     .local v1, "childHeightSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mWidthMeasureSpec:I
a=0;// 
a=0;//     .line 362
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v9, v9, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 361
a=0;//     invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 365
a=0;//     .local v5, "childWidthSpec":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v8, v8, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 372
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 372
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     .line 373
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 372
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     div-int/lit8 v9, v9, 0x2
a=0;// 
a=0;//     .line 371
a=0;//     add-int v4, v8, v9
a=0;// 
a=0;//     .line 374
a=0;//     .local v4, "childTop":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     add-int v0, v4, v8
a=0;// 
a=0;//     .line 376
a=0;//     .local v0, "childBottom":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 377
a=0;//     .local v7, "width":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 378
a=0;//     .local v2, "childLeft":I
a=0;//     #v2=(Null);
a=0;//     add-int v3, v2, v7
a=0;// 
a=0;//     .line 380
a=0;//     .local v3, "childRight":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v2, v4, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 381
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBaseline()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "childBaseline":I
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     .line 197
a=0;//     .end local v1    # "childBaseline":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 187
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Uninit);v2=(Byte);v3=(Integer);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     invoke-direct {p0, v4}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->makeAndAddView(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 189
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-virtual {v3, v4, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->put(ILandroid/view/View;)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->removeAllViewsInLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPrompt()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->getHintText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method layout(IZ)V
a=0;//     .locals 8
a=0;//     .param p1, "delta"    # I
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 255
a=0;//     #v7=(Null);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v0, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 256
a=0;//     .local v0, "childrenLeft":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v6, v6, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v6, v6, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int v1, v5, v6
a=0;// 
a=0;//     .line 258
a=0;//     .local v1, "childrenWidth":I
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->handleDataChanged()V
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mItemCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->resetList()V
a=0;// 
a=0;//     .line 302
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 268
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mNextSelectedPosition:I
a=0;// 
a=0;//     if-ltz v5, :cond_2
a=0;// 
a=0;//     .line 269
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mNextSelectedPosition:I
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 272
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->recycleAllViews()V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->removeAllViewsInLayout()V
a=0;// 
a=0;//     .line 278
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     .line 279
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->makeAndAddView(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 280
a=0;//     .local v2, "sel":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 281
a=0;//     .local v4, "width":I
a=0;//     #v4=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "selectedOffset":I
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mGravity:I
a=0;// 
a=0;//     and-int/lit8 v5, v5, 0x7
a=0;// 
a=0;//     sparse-switch v5, :sswitch_data_0
a=0;// 
a=0;//     .line 290
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->clear()V
a=0;// 
a=0;//     .line 295
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->invalidate()V
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 299
a=0;//     iput-boolean v7, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     .line 300
a=0;//     iput-boolean v7, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mNeedSync:Z
a=0;// 
a=0;//     .line 301
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 284
a=0;//     :sswitch_0
a=0;//     div-int/lit8 v5, v1, 0x2
a=0;// 
a=0;//     add-int/2addr v5, v0
a=0;// 
a=0;//     div-int/lit8 v6, v4, 0x2
a=0;// 
a=0;//     sub-int v3, v5, v6
a=0;// 
a=0;//     .line 285
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     :sswitch_1
a=0;//     add-int v5, v0, v1
a=0;// 
a=0;//     sub-int v3, v5, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 282
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;//     .locals 13
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;//     .param p2, "background"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 428
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     .line 431
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 432
a=0;//     .local v8, "width":I
a=0;//     #v8=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 433
a=0;//     .local v5, "itemView":Landroid/view/View;
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 435
a=0;//     .local v4, "itemType":I
a=0;//     #v4=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 437
a=0;//     .local v9, "widthMeasureSpec":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 441
a=0;//     .local v2, "heightMeasureSpec":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 442
a=0;//     .local v7, "start":I
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v11, v7, 0xf
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 443
a=0;//     .local v1, "end":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v7
a=0;// 
a=0;//     .line 444
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     rsub-int/lit8 v11, v0, 0xf
a=0;// 
a=0;//     sub-int v11, v7, v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 445
a=0;//     move v3, v7
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Integer);v5=(Reference,Landroid/view/View;);v6=(Conflicted);v8=(Integer);v10=(Integer);v12=(Conflicted);
a=0;//     if-lt v3, v1, :cond_2
a=0;// 
a=0;//     .line 462
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p2, v10}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v10, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v10, v10, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v11, v11, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v10, v11
a=0;// 
a=0;//     add-int/2addr v8, v10
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 446
a=0;//     :cond_2
a=0;//     invoke-interface {p1, v3}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 447
a=0;//     .local v6, "positionType":I
a=0;//     #v6=(Integer);
a=0;//     if-eq v6, v4, :cond_3
a=0;// 
a=0;//     .line 448
a=0;//     move v4, v6
a=0;// 
a=0;//     .line 449
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 451
a=0;//     :cond_3
a=0;//     invoke-interface {p1, v3, v5, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 452
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v10, :cond_4
a=0;// 
a=0;//     .line 453
a=0;//     new-instance v10, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .line 454
a=0;//     #v10=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v11, -0x2
a=0;// 
a=0;//     .line 455
a=0;//     #v11=(Byte);
a=0;//     const/4 v12, -0x2
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     invoke-direct {v10, v11, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 453
a=0;//     #v10=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 457
a=0;//     :cond_4
a=0;//     #v11=(Integer);v12=(Conflicted);
a=0;//     invoke-virtual {v5, v9, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 458
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 445
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 0
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     invoke-virtual {p0, p2}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setSelection(I)V
a=0;// 
a=0;//     .line 400
a=0;//     invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
a=0;// 
a=0;//     .line 401
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->dismiss()V
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 2
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     #v1=(Null);
a=0;//     invoke-super/range {p0 .. p5}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 242
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mInLayout:Z
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {p0, v1, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->layout(IZ)V
a=0;// 
a=0;//     .line 244
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mInLayout:Z
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 3
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->onMeasure(II)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, -0x80000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 227
a=0;//     .local v0, "measuredWidth":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 226
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 228
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 231
a=0;//     .end local v0    # "measuredWidth":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performClick()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->performClick()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 387
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 388
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 390
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     invoke-interface {v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     invoke-interface {v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->show()V
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     invoke-direct {v1, p1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 179
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mTempAdapter:Lcom/actionbarsherlock/internal/widget/IcsSpinner$DropDownAdapter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setEnabled(Z)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mDisableChildrenWhenDisabled:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-lt v1, v0, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     .end local v0    # "count":I
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v0    # "count":I
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V
a=0;// 
a=0;//     .line 146
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setGravity(I)V
a=0;//     .locals 1
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     and-int/lit8 v0, p1, 0x7
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     or-int/lit8 p1, p1, 0x3
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mGravity:I
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->requestLayout()V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     .local p1, "l":Landroid/widget/AdapterView$OnItemClickListener;, "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "setOnItemClickListener cannot be used with a spinner."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setPrompt(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "prompt"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;);
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 409
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptId(I)V
a=0;//     .locals 1
a=0;//     .param p1, "promptId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 416
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setPrompt(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 417
a=0;//     return-void
a=0;// .end method
}}
