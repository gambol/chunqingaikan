package com.actionbarsherlock.internal.view.menu; class MenuPopupHelper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuPopupHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnKeyListener;
a=0;// .implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// .implements Landroid/widget/PopupWindow$OnDismissListener;
a=0;// .implements Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuPresenter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$ExpandedIndexObserver;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;",
a=0;//         "Landroid/view/View$OnKeyListener;",
a=0;//         "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
a=0;//         "Landroid/widget/PopupWindow$OnDismissListener;",
a=0;//         "Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;",
a=0;//         "Lcom/actionbarsherlock/internal/view/menu/MenuPresenter;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ITEM_LAYOUT:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;// .field private mAnchorView:Landroid/view/View;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mForceShowIcon:Z
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mOverflowOnly:Z
a=0;// 
a=0;// .field private mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;// .field private mPopupMaxWidth:I
a=0;// 
a=0;// .field private mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// .field private mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     sget v0, Lcom/actionbarsherlock/R$layout;->abs__popup_menu_item_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->ITEM_LAYOUT:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p3, "anchorView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p3, "anchorView"    # Landroid/view/View;
a=0;//     .param p4, "overflowOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 81
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 82
a=0;//     iput-boolean p4, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "res":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     .line 86
a=0;//     sget v2, Lcom/actionbarsherlock/R$dimen;->abs__config_prefDialogWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p2, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->addMenuPresenter(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;)Landroid/view/LayoutInflater;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;)Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;)Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private measureContentWidth(Landroid/widget/ListAdapter;)I
a=0;//     .locals 10
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 171
a=0;//     #v8=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     .local v6, "width":I
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     .local v4, "itemView":Landroid/view/View;
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     .local v3, "itemType":I
a=0;//     #v3=(Null);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 177
a=0;//     .local v7, "widthMeasureSpec":I
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "heightMeasureSpec":I
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Integer);v4=(Reference,Landroid/view/View;);v5=(Conflicted);v6=(Integer);v8=(Integer);v9=(Conflicted);
a=0;//     if-lt v2, v0, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     return v6
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     invoke-interface {p1, v2}, Landroid/widget/ListAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 181
a=0;//     .local v5, "positionType":I
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v3, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 183
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v8, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v8, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 188
a=0;//     :cond_2
a=0;//     #v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-interface {p1, v2, v4, v8}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v4, v7, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 179
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseItemActionView(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public expandItemActionView(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public flagActionItems()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;//     .locals 2
a=0;//     .param p1, "root"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "MenuPopupHelpers manage their own views"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public initForMenu(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 277
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 273
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;->onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->close()V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 146
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 148
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;->removeOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onGlobalLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "anchor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 206
a=0;//     .end local v0    # "anchor":Landroid/view/View;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 201
a=0;//     .restart local v0    # "anchor":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 4
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "adapter":Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;->access$1(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;)Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p3}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;->getItem(I)Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->performItemAction(Lcom/actionbarsherlock/view/MenuItem;I)Z
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 162
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x52
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p2, v1, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;//     .locals 8
a=0;//     .param p1, "subMenu"    # Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 243
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 244
a=0;//     new-instance v4, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v4, v6, p1, v7, v5}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 245
a=0;//     .local v4, "subPopup":Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 247
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     .local v3, "preserveIconSpacing":Z
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 249
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v6=(Conflicted);
a=0;//     if-lt v2, v1, :cond_2
a=0;// 
a=0;//     .line 256
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->setForceShowIcon(Z)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->tryShow()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v5, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;->onOpenSubMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)Z
a=0;// 
a=0;//     .line 262
a=0;//     :cond_0
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 265
a=0;//     .end local v1    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "preserveIconSpacing":Z
a=0;//     .end local v4    # "subPopup":Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v7=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 250
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "preserveIconSpacing":Z
a=0;//     .restart local v4    # "subPopup":Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Integer);v3=(Null);v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);v5=(Null);v6=(Conflicted);v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p1, v2}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "childItem":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->isVisible()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 253
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 249
a=0;//     :cond_3
a=0;//     #v3=(Null);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onViewAttachedToWindow(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDetachedFromWindow(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_1
a=0;//     check-cast p1, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;
a=0;// 
a=0;//     .end local p1    # "v":Landroid/view/View;
a=0;//     invoke-interface {p1, p0}, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;->removeOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;// 
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnchorView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "cb"    # Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setForceShowIcon(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "forceShow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mForceShowIcon:Z
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->tryShow()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "MenuPopupHelper cannot be used without an anchor"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryShow()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 108
a=0;//     #v3=(One);
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget v6, Lcom/actionbarsherlock/R$attr;->popupMenuStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v2, v4, v5, v6}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-direct {v2, p0, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;-><init>(Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setModal(Z)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "anchor":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "addGlobalListener":Z
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     :cond_1
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 121
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;
a=0;// 
a=0;//     invoke-interface {v2, p0}, Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;->addOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->measureContentWidth(Landroid/widget/ListAdapter;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setContentWidth(I)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->show()V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mPopup:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
a=0;// 
a=0;//     .line 131
a=0;//     .end local v0    # "addGlobalListener":Z
a=0;//     :goto_0
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v3=(One);v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);v5=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 124
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateMenuView(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "cleared"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->mAdapter:Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper$MenuAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
