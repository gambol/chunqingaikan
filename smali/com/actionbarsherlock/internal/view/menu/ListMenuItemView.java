package com.actionbarsherlock.internal.view.menu; class ListMenuItemView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "ListMenuItemView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mForceShowIcon:Z
a=0;// 
a=0;// .field private mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;// .field private mPreserveIconSpacing:Z
a=0;// 
a=0;// .field private mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;// .field private mShortcutView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mTextAppearance:I
a=0;// 
a=0;// .field private mTextAppearanceContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 80
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 66
a=0;//     sget-object v1, Lcom/actionbarsherlock/R$styleable;->SherlockMenuView:[I
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTextAppearance:I
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     .line 71
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTextAppearanceContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getInflater()Landroid/view/LayoutInflater;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 276
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private insertCheckBox()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 259
a=0;//     .local v0, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$layout;->abs__list_menu_item_checkbox:I
a=0;// 
a=0;//     .line 260
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 259
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 258
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private insertIconView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 243
a=0;//     .local v0, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$layout;->abs__list_menu_item_icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 246
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private insertRadioButton()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$layout;->abs__list_menu_item_radio:I
a=0;// 
a=0;//     .line 252
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 250
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getItemData()Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;I)V
a=0;//     .locals 2
a=0;//     .param p1, "itemData"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .param p2, "menuType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setVisibility(I)V
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {p1, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getTitleForItemView(Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isCheckable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setCheckable(Z)V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->shouldShowShortcut()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getShortcut()C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setShortcut(ZC)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setEnabled(Z)V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onFinishInflate()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 88
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__title:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 89
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTextAppearance:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTextAppearanceContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTextAppearance:I
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__shortcut:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 3
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "iconLp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I
a=0;// 
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I
a=0;// 
a=0;//     .line 238
a=0;//     .end local v0    # "iconLp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v1    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public prefersCondensedTitle()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     .line 130
a=0;//     #v3=(PosByte);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RadioButton;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 134
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RadioButton;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->insertRadioButton()V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_2
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->insertCheckBox()V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_3
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "compoundButton":Landroid/widget/CompoundButton;
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 154
a=0;//     .local v2, "otherCompoundButton":Landroid/widget/CompoundButton;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ujava/lang/Object;);
a=0;//     if-eqz p1, :cond_7
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isChecked()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     .local v1, "newVisibility":I
a=0;//     :goto_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0}, Landroid/widget/CompoundButton;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v1, :cond_4
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 163
a=0;//     :cond_4
a=0;//     invoke-virtual {v2}, Landroid/widget/CompoundButton;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eq v4, v3, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     .end local v0    # "compoundButton":Landroid/widget/CompoundButton;
a=0;//     .end local v1    # "newVisibility":I
a=0;//     .end local v2    # "otherCompoundButton":Landroid/widget/CompoundButton;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v0    # "compoundButton":Landroid/widget/CompoundButton;
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .restart local v2    # "otherCompoundButton":Landroid/widget/CompoundButton;
a=0;//     #v2=(Reference,Landroid/widget/RadioButton;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 167
a=0;//     :cond_7
a=0;//     #v1=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/RadioButton;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RadioButton;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->insertRadioButton()V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 187
a=0;//     .local v0, "compoundButton":Landroid/widget/CompoundButton;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// 
a=0;//     .line 181
a=0;//     .end local v0    # "compoundButton":Landroid/widget/CompoundButton;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 182
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->insertCheckBox()V
a=0;// 
a=0;//     .line 184
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .restart local v0    # "compoundButton":Landroid/widget/CompoundButton;
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setForceShowIcon(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "forceShow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z
a=0;// 
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 3
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 204
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->shouldShowIcon()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "showIcon":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     .end local p1    # "icon":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 204
a=0;//     .end local v0    # "showIcon":Z
a=0;//     .restart local p1    # "icon":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Boolean);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     .restart local v0    # "showIcon":Z
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 214
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->insertIconView()V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_4
a=0;//     if-nez p1, :cond_5
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 218
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .end local p1    # "icon":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_2
a=0;//     invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 218
a=0;//     .restart local p1    # "icon":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_6
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 224
a=0;//     :cond_7
a=0;//     #v2=(Boolean);p1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(ZC)V
a=0;//     .locals 3
a=0;//     .param p1, "showShortcut"    # Z
a=0;//     .param p2, "shortcutKey"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->shouldShowShortcut()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "newVisibility":I
a=0;//     :goto_0
a=0;//     #v0=(PosByte);v1=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mItemData:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getShortcutLabel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 192
a=0;//     .end local v0    # "newVisibility":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     .line 115
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showsIcon()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
