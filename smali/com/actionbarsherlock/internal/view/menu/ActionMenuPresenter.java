package com.actionbarsherlock.internal.view.menu; class ActionMenuPresenter { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// .super Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/ActionProvider$SubUiVisibilityListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$HasPermanentMenuKey;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActionButtonGroups:Landroid/util/SparseBooleanArray;
a=0;// 
a=0;// .field private mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;// .field private mActionItemWidthLimit:I
a=0;// 
a=0;// .field private mExpandedActionViewsExclusive:Z
a=0;// 
a=0;// .field private mMaxItems:I
a=0;// 
a=0;// .field private mMaxItemsSet:Z
a=0;// 
a=0;// .field private mMinCellSize:I
a=0;// 
a=0;// .field mOpenSubMenuId:I
a=0;// 
a=0;// .field private mOverflowButton:Landroid/view/View;
a=0;// 
a=0;// .field private mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;// .field final mPopupPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;// .field private mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;// .field private mReserveOverflow:Z
a=0;// 
a=0;// .field private mReserveOverflowSet:Z
a=0;// 
a=0;// .field private mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;// .field private mStrictWidthLimit:Z
a=0;// 
a=0;// .field private mWidthLimit:I
a=0;// 
a=0;// .field private mWidthLimitSet:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     sget v0, Lcom/actionbarsherlock/R$layout;->abs__action_menu_layout:I
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/actionbarsherlock/R$layout;->abs__action_menu_item_layout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     new-instance v0, Landroid/util/SparseBooleanArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseBooleanArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseBooleanArray;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonGroups:Landroid/util/SparseBooleanArray;
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private findViewForItem(Lcom/actionbarsherlock/view/MenuItem;)Landroid/view/View;
a=0;//     .locals 6
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 279
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 280
a=0;//     .local v3, "parent":Landroid/view/ViewGroup;
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 283
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     if-lt v2, v1, :cond_2
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 290
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 284
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 285
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v4, v0, Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 286
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     invoke-interface {v4}, Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;->getItemData()Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eq v4, p1, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static reserveOverflow(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v0=(Null);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$HasPermanentMenuKey;->get(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bindItemView(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;)V
a=0;//     .locals 3
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .param p2, "itemView"    # Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {p2, p1, v2}, Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;->initialize(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .local v1, "menuView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView$ItemView;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "actionItemView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->setItemInvoker(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dismissPopupMenus()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 340
a=0;//     .local v0, "result":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 341
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public filterLeftoverView(Landroid/view/ViewGroup;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "parent"    # Landroid/view/ViewGroup;
a=0;//     .param p2, "childIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->filterLeftoverView(Landroid/view/ViewGroup;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public flagActionItems()Z
a=0;//     .locals 29
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual/range {v27 .. v27}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 373
a=0;//     .local v25, "visibleItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v25=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 374
a=0;//     .local v15, "itemsSize":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItems:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 375
a=0;//     .local v17, "maxActions":I
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionItemWidthLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     .line 376
a=0;//     .local v26, "widthLimit":I
a=0;//     #v26=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     invoke-static/range {v27 .. v28}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 377
a=0;//     .local v20, "querySpec":I
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     check-cast v19, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 379
a=0;//     .local v19, "parent":Landroid/view/ViewGroup;
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .line 380
a=0;//     .local v22, "requiredItems":I
a=0;//     #v22=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     .local v21, "requestedItems":I
a=0;//     #v21=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     .local v8, "firstActionWidth":I
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     .local v10, "hasOverflow":Z
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v10=(Boolean);v11=(Integer);v14=(Conflicted);v21=(Integer);v22=(Integer);v27=(Boolean);
a=0;//     if-lt v11, v15, :cond_3
a=0;// 
a=0;//     .line 400
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     if-eqz v27, :cond_1
a=0;// 
a=0;//     .line 401
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     add-int v27, v22, v21
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 402
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v17, v17, -0x1
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     sub-int v17, v17, v22
a=0;// 
a=0;//     .line 406
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonGroups:Landroid/util/SparseBooleanArray;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     .line 407
a=0;//     .local v23, "seenGroups":Landroid/util/SparseBooleanArray;
a=0;//     #v23=(Reference,Landroid/util/SparseBooleanArray;);
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/util/SparseBooleanArray;->clear()V
a=0;// 
a=0;//     .line 409
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 410
a=0;//     .local v4, "cellSize":I
a=0;//     #v4=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 411
a=0;//     .local v7, "cellsRemaining":I
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_2
a=0;// 
a=0;//     .line 412
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     div-int v7, v26, v27
a=0;// 
a=0;//     .line 413
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     rem-int v5, v26, v27
a=0;// 
a=0;//     .line 414
a=0;//     .local v5, "cellSizeRemaining":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     div-int v28, v5, v7
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-int v4, v27, v28
a=0;// 
a=0;//     .line 418
a=0;//     .end local v5    # "cellSizeRemaining":I
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v8=(Integer);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v16=(Conflicted);v18=(Conflicted);v24=(Conflicted);
a=0;//     if-lt v11, v15, :cond_7
a=0;// 
a=0;//     .line 499
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     return v27
a=0;// 
a=0;//     .line 384
a=0;//     .end local v4    # "cellSize":I
a=0;//     .end local v7    # "cellsRemaining":I
a=0;//     .end local v23    # "seenGroups":Landroid/util/SparseBooleanArray;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Uninit);v12=(Uninit);v13=(Uninit);v16=(Uninit);v18=(Uninit);v23=(Uninit);v24=(Uninit);v27=(Boolean);v28=(Null);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 385
a=0;//     .local v14, "item":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->requiresActionButton()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     if-eqz v27, :cond_5
a=0;// 
a=0;//     .line 386
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     .line 392
a=0;//     :goto_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mExpandedActionViewsExclusive:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     .line 395
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     :cond_4
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 387
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->requestsActionButton()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     if-eqz v27, :cond_6
a=0;// 
a=0;//     .line 388
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     .line 389
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 390
a=0;//     :cond_6
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 419
a=0;//     .end local v14    # "item":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .restart local v4    # "cellSize":I
a=0;//     .restart local v7    # "cellsRemaining":I
a=0;//     .restart local v23    # "seenGroups":Landroid/util/SparseBooleanArray;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Integer);v9=(Conflicted);v10=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);v18=(Conflicted);v23=(Reference,Landroid/util/SparseBooleanArray;);v24=(Conflicted);v27=(Integer);v28=(Integer);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 421
a=0;//     .restart local v14    # "item":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->requiresActionButton()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_d
a=0;// 
a=0;//     .line 422
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0, v14, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getItemView(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 423
a=0;//     .local v24, "v":Landroid/view/View;
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     if-nez v27, :cond_8
a=0;// 
a=0;//     .line 424
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     .line 426
a=0;//     :cond_8
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_c
a=0;// 
a=0;//     .line 428
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v4, v7, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     sub-int v7, v7, v27
a=0;// 
a=0;//     .line 432
a=0;//     :goto_3
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 433
a=0;//     .local v18, "measuredWidth":I
a=0;//     #v18=(Integer);
a=0;//     sub-int v26, v26, v18
a=0;// 
a=0;//     .line 434
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     .line 435
a=0;//     move/from16 v8, v18
a=0;// 
a=0;//     .line 437
a=0;//     :cond_9
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 438
a=0;//     .local v9, "groupId":I
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     .line 439
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V
a=0;// 
a=0;//     .line 441
a=0;//     :cond_a
a=0;//     #v1=(Integer);v27=(Integer);
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v14, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V
a=0;// 
a=0;//     .line 418
a=0;//     .end local v9    # "groupId":I
a=0;//     .end local v18    # "measuredWidth":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_b
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);v18=(Conflicted);v24=(Conflicted);v27=(Integer);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 430
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);v2=(Reference,Landroid/view/ViewGroup;);v24=(Reference,Landroid/view/View;);v27=(Boolean);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 442
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v2=(Conflicted);v24=(Conflicted);
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->requestsActionButton()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     if-eqz v27, :cond_b
a=0;// 
a=0;//     .line 445
a=0;//     invoke-virtual {v14}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 446
a=0;//     .restart local v9    # "groupId":I
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/util/SparseBooleanArray;->get(I)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 447
a=0;//     .local v12, "inGroup":Z
a=0;//     #v12=(Boolean);
a=0;//     if-gtz v17, :cond_e
a=0;// 
a=0;//     if-eqz v12, :cond_16
a=0;// 
a=0;//     :cond_e
a=0;//     if-lez v26, :cond_16
a=0;// 
a=0;//     .line 448
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     if-eqz v27, :cond_f
a=0;// 
a=0;//     .line 447
a=0;//     if-lez v7, :cond_16
a=0;// 
a=0;//     :cond_f
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     .line 450
a=0;//     .local v13, "isAction":Z
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v13=(Boolean);
a=0;//     if-eqz v13, :cond_13
a=0;// 
a=0;//     .line 451
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0, v14, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->getItemView(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 452
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     if-nez v27, :cond_10
a=0;// 
a=0;//     .line 453
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     .line 455
a=0;//     :cond_10
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_17
a=0;// 
a=0;//     .line 457
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     .line 456
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v4, v7, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 458
a=0;//     .local v6, "cells":I
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v7, v6
a=0;// 
a=0;//     .line 459
a=0;//     if-nez v6, :cond_11
a=0;// 
a=0;//     .line 460
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 465
a=0;//     .end local v6    # "cells":I
a=0;//     :cond_11
a=0;//     :goto_6
a=0;//     #v2=(Integer);v6=(Conflicted);v27=(Boolean);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 466
a=0;//     .restart local v18    # "measuredWidth":I
a=0;//     #v18=(Integer);
a=0;//     sub-int v26, v26, v18
a=0;// 
a=0;//     .line 467
a=0;//     if-nez v8, :cond_12
a=0;// 
a=0;//     .line 468
a=0;//     move/from16 v8, v18
a=0;// 
a=0;//     .line 471
a=0;//     :cond_12
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     if-eqz v27, :cond_19
a=0;// 
a=0;//     .line 472
a=0;//     if-ltz v26, :cond_18
a=0;// 
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     :goto_7
a=0;//     and-int v13, v13, v27
a=0;// 
a=0;//     .line 479
a=0;//     .end local v18    # "measuredWidth":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_13
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v18=(Conflicted);v24=(Conflicted);
a=0;//     if-eqz v13, :cond_1b
a=0;// 
a=0;//     if-eqz v9, :cond_1b
a=0;// 
a=0;//     .line 480
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseBooleanArray;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V
a=0;// 
a=0;//     .line 494
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v1=(Conflicted);v27=(Integer);
a=0;//     if-eqz v13, :cond_15
a=0;// 
a=0;//     add-int/lit8 v17, v17, -0x1
a=0;// 
a=0;//     .line 496
a=0;//     :cond_15
a=0;//     invoke-virtual {v14, v13}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 447
a=0;//     .end local v13    # "isAction":Z
a=0;//     :cond_16
a=0;//     #v13=(Conflicted);v27=(Boolean);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 463
a=0;//     .restart local v13    # "isAction":Z
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     :cond_17
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);v2=(Reference,Landroid/view/ViewGroup;);v13=(Boolean);v24=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 472
a=0;//     .restart local v18    # "measuredWidth":I
a=0;//     :cond_18
a=0;//     #v0=(Boolean);v18=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 475
a=0;//     :cond_19
a=0;//     #v27=(Boolean);
a=0;//     add-int v27, v26, v8
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     if-lez v27, :cond_1a
a=0;// 
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     :goto_9
a=0;//     #v27=(Boolean);
a=0;//     and-int v13, v13, v27
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_1a
a=0;//     #v27=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 481
a=0;//     .end local v18    # "measuredWidth":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_1b
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v18=(Conflicted);v24=(Conflicted);v27=(Boolean);
a=0;//     if-eqz v12, :cond_14
a=0;// 
a=0;//     .line 483
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseBooleanArray;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V
a=0;// 
a=0;//     .line 484
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .local v16, "j":I
a=0;//     :goto_a
a=0;//     #v0=(Conflicted);v1=(Integer);v16=(Integer);v27=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v11, :cond_14
a=0;// 
a=0;//     .line 485
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 486
a=0;//     .local v3, "areYouMyGroupie":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v9, :cond_1d
a=0;// 
a=0;//     .line 488
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionButton()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_1c
a=0;// 
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     .line 489
a=0;//     :cond_1c
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V
a=0;// 
a=0;//     .line 484
a=0;//     :cond_1d
a=0;//     #v0=(Integer);v27=(Integer);
a=0;//     add-int/lit8 v16, v16, 0x1
a=0;// 
a=0;//     goto :goto_a
a=0;// .end method
a=0;// 
a=0;// .method public getItemView(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "actionView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->hasCollapsibleActionView()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 175
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     instance-of v3, p2, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->getItemView(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_2
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     move-object v2, p3
a=0;// 
a=0;//     .line 182
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 183
a=0;//     .local v2, "menuParent":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 180
a=0;//     .end local v1    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v2    # "menuParent":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;//     .locals 2
a=0;//     .param p1, "root"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "result":Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 167
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setPresenter(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)V
a=0;// 
a=0;//     .line 168
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hideOverflowMenu()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 320
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;);
a=0;//     invoke-virtual {v1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 322
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 331
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ujava/lang/Object;);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     .line 327
a=0;//     .local v0, "popup":Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 329
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hideSubMenus()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->dismiss()V
a=0;// 
a=0;//     .line 352
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 354
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initForMenu(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->initForMenu(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "res":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflowSet:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->reserveOverflow(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mWidthLimitSet:Z
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I
a=0;// 
a=0;//     .line 96
a=0;//     :cond_1
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     sget v3, Lcom/actionbarsherlock/R$integer;->abs__max_action_buttons:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1, v3}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getInteger(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItems:I
a=0;// 
a=0;//     .line 100
a=0;//     :cond_2
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I
a=0;// 
a=0;//     .line 101
a=0;//     .local v2, "width":I
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v3, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mSystemContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, p0, v4}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 105
a=0;//     .local v1, "spec":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3, v1, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 107
a=0;//     .end local v1    # "spec":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionItemWidthLimit:I
a=0;// 
a=0;//     .line 114
a=0;//     const/high16 v3, 0x42600000    # 56.0f
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v4, v4, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I
a=0;// 
a=0;//     .line 117
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     iput-object v6, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 361
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->isShowing()Z
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
a=0;// .method public isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 504
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 505
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     .line 506
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$integer;->abs__max_action_buttons:I
a=0;// 
a=0;//     .line 136
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getInteger(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItems:I
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 5
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;// 
a=0;//     .line 518
a=0;//     .local v1, "saved":Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;//     iget v3, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 519
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     iget v4, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->findItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 520
a=0;//     .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 521
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->getSubMenu()Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .line 522
a=0;//     .local v2, "subMenu":Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     .line 525
a=0;//     .end local v0    # "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .end local v2    # "subMenu":Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;-><init>()V
a=0;// 
a=0;//     .line 511
a=0;//     .local v0, "state":Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I
a=0;// 
a=0;//     .line 512
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;//     .locals 5
a=0;//     .param p1, "subMenu"    # Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 258
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 261
a=0;//     .local v1, "topSubMenu":Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getParentMenu()Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/view/Menu;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-ne v3, v4, :cond_3
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->findViewForItem(Lcom/actionbarsherlock/view/MenuItem;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 265
a=0;//     .local v0, "anchor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     .line 270
a=0;//     :cond_2
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     invoke-interface {v2}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I
a=0;// 
a=0;//     .line 271
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, p0, v3, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->show()V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     .line 275
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     .end local v0    # "anchor":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Null);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->getParentMenu()Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "topSubMenu":Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .restart local v1    # "topSubMenu":Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onSubUiVisibilityChanged(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "isVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 531
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     .line 535
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 533
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setExpandedActionViewsExclusive(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "isExclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mExpandedActionViewsExclusive:Z
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setItemLimit(I)V
a=0;//     .locals 1
a=0;//     .param p1, "itemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItems:I
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setReserveOverflow(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "reserveOverflow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     .line 152
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflowSet:Z
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWidthLimit(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "strict"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I
a=0;// 
a=0;//     .line 146
a=0;//     iput-boolean p2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z
a=0;// 
a=0;//     .line 147
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mWidthLimitSet:Z
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldIncludeItem(ILcom/actionbarsherlock/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 1
a=0;//     .param p1, "childIndex"    # I
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     invoke-virtual {p2}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionButton()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public showOverflowMenu()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 298
a=0;//     #v5=(One);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 300
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 301
a=0;//     .local v0, "popup":Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 307
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     .line 311
a=0;//     .end local v0    # "popup":Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
a=0;//     return v5
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateMenuView(Z)V
a=0;//     .locals 11
a=0;//     .param p1, "cleared"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 206
a=0;//     #v9=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/BaseMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->getActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 210
a=0;//     .local v0, "actionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 211
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v7=(Conflicted);
a=0;//     if-lt v3, v1, :cond_5
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "actionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     .end local v1    # "count":I
a=0;//     .end local v3    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 222
a=0;//     .local v5, "nonActionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     :goto_1
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 223
a=0;//     .local v2, "hasOverflow":Z
a=0;//     #v2=(Null);
a=0;//     iget-boolean v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 225
a=0;//     .restart local v1    # "count":I
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v10, :cond_9
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     move v2, v9
a=0;// 
a=0;//     .line 232
a=0;//     .end local v1    # "count":I
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v8, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mSystemContext:Landroid/content/Context;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v8, p0, v9}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     .line 236
a=0;//     :cond_2
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 237
a=0;//     .local v6, "parent":Landroid/view/ViewGroup;
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     if-eq v6, v8, :cond_4
a=0;// 
a=0;//     .line 238
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 241
a=0;//     :cond_3
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 242
a=0;//     .local v4, "menuView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateOverflowButtonLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v4, v8, v9}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 248
a=0;//     .end local v4    # "menuView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;//     .end local v6    # "parent":Landroid/view/ViewGroup;
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     check-cast v8, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iget-boolean v9, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-virtual {v8, v9}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setOverflowReserved(Z)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// 
a=0;//     .line 212
a=0;//     .end local v2    # "hasOverflow":Z
a=0;//     .end local v5    # "nonActionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     .restart local v0    # "actionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Integer);v2=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->getActionProvider()Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 213
a=0;//     .local v7, "provider":Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {v7, p0}, Lcom/actionbarsherlock/view/ActionProvider;->setSubUiVisibilityListener(Lcom/actionbarsherlock/view/ActionProvider$SubUiVisibilityListener;)V
a=0;// 
a=0;//     .line 211
a=0;//     :cond_6
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     .end local v0    # "actionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     .end local v1    # "count":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v7    # "provider":Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v2    # "hasOverflow":Z
a=0;//     .restart local v5    # "nonActionItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_8
a=0;//     #v1=(Integer);v2=(Null);v5=(Reference,Ljava/util/ArrayList;);v8=(Boolean);
a=0;//     move v2, v10
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 228
a=0;//     :cond_9
a=0;//     #v2=(Null);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     move v2, v10
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Null);
a=0;//     move v2, v9
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 244
a=0;//     .end local v1    # "count":I
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuView;);
a=0;//     if-ne v8, v9, :cond_4
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mMenuView:Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;//     check-cast v8, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
