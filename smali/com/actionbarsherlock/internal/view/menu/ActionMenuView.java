package com.actionbarsherlock.internal.view.menu; class ActionMenuView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;
a=0;// .super Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// .source "ActionMenuView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;,
a=0;//         Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final GENERATED_ITEM_PADDING:I = 0x4
a=0;// 
a=0;// .field private static final IS_FROYO:Z
a=0;// 
a=0;// .field static final MIN_CELL_SIZE:I = 0x38
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFirst:Z
a=0;// 
a=0;// .field private mFormatItems:Z
a=0;// 
a=0;// .field private mFormatItemsWidth:I
a=0;// 
a=0;// .field private mGeneratedItemPadding:I
a=0;// 
a=0;// .field private mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mMinCellSize:I
a=0;// 
a=0;// .field private mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// .field private mReserveOverflow:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->IS_FROYO:Z
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFirst:Z
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setBaselineAligned(Z)V
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x42600000    # 56.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     .line 61
a=0;//     const/high16 v1, 0x40800000    # 4.0f
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static measureChildForCells(Landroid/view/View;IIII)I
a=0;//     .locals 12
a=0;//     .param p0, "child"    # Landroid/view/View;
a=0;//     .param p1, "cellSize"    # I
a=0;//     .param p2, "cellsRemaining"    # I
a=0;//     .param p3, "parentHeightMeasureSpec"    # I
a=0;//     .param p4, "parentHeightPadding"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 351
a=0;//     .local v7, "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int v2, v10, p4
a=0;// 
a=0;//     .line 353
a=0;//     .local v2, "childHeightSize":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 354
a=0;//     .local v1, "childHeightMode":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 356
a=0;//     .local v3, "childHeightSpec":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 357
a=0;//     .local v0, "cellsUsed":I
a=0;//     #v0=(Null);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     mul-int v10, p1, p2
a=0;// 
a=0;//     const/high16 v11, -0x80000000
a=0;// 
a=0;//     .line 358
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 360
a=0;//     .local v4, "childWidthSpec":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 362
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 363
a=0;//     .local v8, "measuredWidth":I
a=0;//     #v8=(Integer);
a=0;//     div-int v0, v8, p1
a=0;// 
a=0;//     .line 364
a=0;//     #v0=(Integer);
a=0;//     rem-int v10, v8, p1
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 367
a=0;//     .end local v4    # "childWidthSpec":I
a=0;//     .end local v8    # "measuredWidth":I
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v8=(Conflicted);v11=(Conflicted);
a=0;//     instance-of v10, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     move-object v10, p0
a=0;// 
a=0;//     .line 368
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     check-cast v10, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     move-object v6, v10
a=0;// 
a=0;//     .line 369
a=0;//     .local v6, "itemView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;//     :goto_0
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;);v10=(Conflicted);
a=0;//     iget-boolean v10, v7, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_2
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 370
a=0;//     .local v5, "expandable":Z
a=0;//     :goto_1
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, v7, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     .line 372
a=0;//     iput v0, v7, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 373
a=0;//     mul-int v9, v0, p1
a=0;// 
a=0;//     .line 374
a=0;//     .local v9, "targetWidth":I
a=0;//     #v9=(Integer);
a=0;//     const/high16 v10, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {p0, v10, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 376
a=0;//     return v0
a=0;// 
a=0;//     .line 368
a=0;//     .end local v5    # "expandable":Z
a=0;//     .end local v6    # "itemView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;//     .end local v9    # "targetWidth":I
a=0;//     :cond_1
a=0;//     #v5=(Uninit);v6=(Uninit);v9=(Uninit);v10=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     .restart local v6    # "itemView":Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;//     :cond_2
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private onMeasureExactFormat(II)V
a=0;//     .locals 42
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 126
a=0;//     .local v17, "heightMode":I
a=0;//     #v17=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     .line 127
a=0;//     .local v37, "widthSize":I
a=0;//     #v37=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 129
a=0;//     .local v19, "heightSize":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     add-int v36, v38, v39
a=0;// 
a=0;//     .line 130
a=0;//     .local v36, "widthPadding":I
a=0;//     #v36=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     add-int v18, v38, v39
a=0;// 
a=0;//     .line 132
a=0;//     .local v18, "heightPadding":I
a=0;//     #v18=(Integer);
a=0;//     sub-int v37, v37, v36
a=0;// 
a=0;//     .line 135
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     div-int v4, v37, v38
a=0;// 
a=0;//     .line 136
a=0;//     .local v4, "cellCount":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     rem-int v6, v37, v38
a=0;// 
a=0;//     .line 138
a=0;//     .local v6, "cellSizeRemaining":I
a=0;//     #v6=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v38
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 332
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v38=(Integer);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v39=(Integer);v40=(Uninit);v41=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     div-int v39, v6, v4
a=0;// 
a=0;//     add-int v5, v38, v39
a=0;// 
a=0;//     .line 146
a=0;//     .local v5, "cellSize":I
a=0;//     #v5=(Integer);
a=0;//     move v8, v4
a=0;// 
a=0;//     .line 147
a=0;//     .local v8, "cellsRemaining":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     .local v25, "maxChildHeight":I
a=0;//     #v25=(Null);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     .local v24, "maxCellsUsed":I
a=0;//     #v24=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     .local v14, "expandableItemCount":I
a=0;//     #v14=(Null);
a=0;//     const/16 v34, 0x0
a=0;// 
a=0;//     .line 151
a=0;//     .local v34, "visibleItemCount":I
a=0;//     #v34=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     .local v16, "hasOverflow":Z
a=0;//     #v16=(Null);
a=0;//     const-wide/16 v32, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     .local v32, "smallestItemsAt":J
a=0;//     #v32=(LongLo);v33=(LongHi);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 157
a=0;//     .local v12, "childCount":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .local v21, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v14=(Integer);v16=(Boolean);v21=(Integer);v22=(Conflicted);v23=(Conflicted);v24=(Integer);v25=(Integer);v34=(Integer);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v12, :cond_8
a=0;// 
a=0;//     .line 196
a=0;//     if-eqz v16, :cond_10
a=0;// 
a=0;//     const/16 v38, 0x2
a=0;// 
a=0;//     #v38=(PosByte);
a=0;//     move/from16 v0, v34
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 201
a=0;//     .local v10, "centerSingleExpandedItem":Z
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v10=(Boolean);v38=(Conflicted);
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     .line 202
a=0;//     .local v30, "needsExpansion":Z
a=0;//     :goto_3
a=0;//     #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
a=0;//     if-lez v14, :cond_1
a=0;// 
a=0;//     if-gtz v8, :cond_11
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     if-nez v16, :cond_1a
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v34
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1a
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     .line 257
a=0;//     .local v31, "singleItem":Z
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v31=(Boolean);v38=(Conflicted);
a=0;//     if-lez v8, :cond_5
a=0;// 
a=0;//     const-wide/16 v38, 0x0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     cmp-long v38, v32, v38
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_5
a=0;// 
a=0;//     .line 258
a=0;//     add-int/lit8 v38, v34, -0x1
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     if-lt v8, v0, :cond_2
a=0;// 
a=0;//     if-nez v31, :cond_2
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-le v0, v1, :cond_5
a=0;// 
a=0;//     .line 259
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v38=(Integer);
a=0;//     invoke-static/range {v32 .. v33}, Ljava/lang/Long;->bitCount(J)I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-float v13, v0
a=0;// 
a=0;//     .line 261
a=0;//     .local v13, "expandCount":F
a=0;//     #v13=(Float);
a=0;//     if-nez v31, :cond_4
a=0;// 
a=0;//     .line 263
a=0;//     const-wide/16 v38, 0x1
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_3
a=0;// 
a=0;//     .line 264
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v38
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 265
a=0;//     .local v23, "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_3
a=0;// 
a=0;//     const/high16 v38, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     sub-float v13, v13, v38
a=0;// 
a=0;//     .line 267
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);v23=(Conflicted);
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     add-int/lit8 v39, v12, -0x1
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     shl-int v38, v38, v39
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_4
a=0;// 
a=0;//     .line 268
a=0;//     add-int/lit8 v38, v12, -0x1
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v38
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 269
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_4
a=0;// 
a=0;//     const/high16 v38, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     sub-float v13, v13, v38
a=0;// 
a=0;//     .line 273
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     cmpl-float v38, v13, v38
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-lez v38, :cond_1b
a=0;// 
a=0;//     .line 274
a=0;//     mul-int v38, v8, v5
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Float);
a=0;//     div-float v38, v38, v13
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     float-to-int v15, v0
a=0;// 
a=0;//     .line 276
a=0;//     .local v15, "extraPixels":I
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v15=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v12, :cond_1c
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 313
a=0;//     .end local v13    # "expandCount":F
a=0;//     .end local v15    # "extraPixels":I
a=0;//     :cond_5
a=0;//     #v13=(Conflicted);v15=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     if-eqz v30, :cond_6
a=0;// 
a=0;//     .line 314
a=0;//     sub-int v38, v19, v18
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 315
a=0;//     .local v20, "heightSpec":I
a=0;//     #v20=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v35=(Conflicted);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v0, v12, :cond_23
a=0;// 
a=0;//     .line 326
a=0;//     .end local v20    # "heightSpec":I
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v20=(Conflicted);v38=(Conflicted);
a=0;//     const/high16 v38, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     .line 327
a=0;//     move/from16 v19, v25
a=0;// 
a=0;//     .line 330
a=0;//     :cond_7
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     .end local v10    # "centerSingleExpandedItem":Z
a=0;//     .end local v30    # "needsExpansion":Z
a=0;//     .end local v31    # "singleItem":Z
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v10=(Uninit);v13=(Uninit);v15=(Uninit);v20=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v35=(Uninit);v38=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 159
a=0;//     .local v11, "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     const/16 v39, 0x8
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 157
a=0;//     :cond_9
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 161
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(PosByte);v38=(Integer);v39=(PosByte);
a=0;//     instance-of v0, v11, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     .line 162
a=0;//     .local v22, "isGeneratedItem":Z
a=0;//     #v22=(Boolean);
a=0;//     add-int/lit8 v34, v34, 0x1
a=0;// 
a=0;//     .line 164
a=0;//     if-eqz v22, :cond_b
a=0;// 
a=0;//     .line 167
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     #v39=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v41
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     .line 170
a=0;//     :cond_b
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v39=(PosByte);v40=(Conflicted);v41=(Conflicted);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 171
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 172
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 173
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 174
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     .line 175
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 176
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz v22, :cond_e
a=0;// 
a=0;//     move-object/from16 v38, v11
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     check-cast v38, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     invoke-virtual/range {v38 .. v38}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_e
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     :goto_9
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     .line 180
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_f
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 182
a=0;//     .local v7, "cellsAvailable":I
a=0;//     :goto_a
a=0;//     #v7=(Integer);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v11, v5, v7, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 185
a=0;//     .local v9, "cellsUsed":I
a=0;//     #v9=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 186
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_c
a=0;// 
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_c
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_d
a=0;// 
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 189
a=0;//     :cond_d
a=0;//     sub-int/2addr v8, v9
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 191
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v9, v0, :cond_9
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     or-long v32, v32, v38
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 177
a=0;//     .end local v7    # "cellsAvailable":I
a=0;//     .end local v9    # "cellsUsed":I
a=0;//     :cond_e
a=0;//     #v0=(Null);v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);v7=(Conflicted);v9=(Conflicted);v38=(Boolean);v39=(PosByte);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v38=(Boolean);
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 180
a=0;//     #v7=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 196
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v22    # "isGeneratedItem":Z
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_10
a=0;//     #v0=(Integer);v1=(Conflicted);v7=(Conflicted);v11=(Conflicted);v22=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 203
a=0;//     .restart local v10    # "centerSingleExpandedItem":Z
a=0;//     .restart local v30    # "needsExpansion":Z
a=0;//     :cond_11
a=0;//     #v10=(Boolean);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
a=0;//     const v26, 0x7fffffff
a=0;// 
a=0;//     .line 204
a=0;//     .local v26, "minCells":I
a=0;//     #v26=(Integer);
a=0;//     const-wide/16 v27, 0x0
a=0;// 
a=0;//     .line 205
a=0;//     .local v27, "minCellsAt":J
a=0;//     #v27=(LongLo);v28=(LongHi);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     .line 206
a=0;//     .local v29, "minCellsItemCount":I
a=0;//     #v29=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v29=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v12, :cond_12
a=0;// 
a=0;//     .line 225
a=0;//     or-long v32, v32, v27
a=0;// 
a=0;//     .line 227
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     if-gt v0, v8, :cond_1
a=0;// 
a=0;//     .line 230
a=0;//     add-int/lit8 v26, v26, 0x1
a=0;// 
a=0;//     .line 232
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     :goto_c
a=0;//     #v0=(Conflicted);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v12, :cond_16
a=0;// 
a=0;//     .line 250
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     #v30=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 207
a=0;//     :cond_12
a=0;//     #v30=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 208
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 211
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_14
a=0;// 
a=0;//     .line 206
a=0;//     :cond_13
a=0;//     :goto_d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 214
a=0;//     :cond_14
a=0;//     #v0=(Boolean);v1=(Integer);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     if-ge v0, v1, :cond_15
a=0;// 
a=0;//     .line 215
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     .line 216
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v27, v0
a=0;// 
a=0;//     .line 217
a=0;//     const/16 v29, 0x1
a=0;// 
a=0;//     .line 218
a=0;//     #v29=(One);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Integer);v1=(Integer);v29=(Integer);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     if-ne v0, v1, :cond_13
a=0;// 
a=0;//     .line 219
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     or-long v27, v27, v38
a=0;// 
a=0;//     .line 220
a=0;//     add-int/lit8 v29, v29, 0x1
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 233
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_16
a=0;//     #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 234
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 235
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     and-long v38, v38, v27
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-nez v38, :cond_18
a=0;// 
a=0;//     .line 237
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_17
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     or-long v32, v32, v38
a=0;// 
a=0;//     .line 232
a=0;//     :cond_17
a=0;//     :goto_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     .line 241
a=0;//     :cond_18
a=0;//     #v0=(LongLo);v1=(LongHi);v38=(Byte);v39=(LongHi);v40=(LongLo);v41=(LongHi);
a=0;//     if-eqz v10, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_19
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v8, v0, :cond_19
a=0;// 
a=0;//     .line 243
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     add-int v38, v38, v5
a=0;// 
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     #v39=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v41
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     .line 245
a=0;//     :cond_19
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     add-int/lit8 v38, v38, 0x1
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 246
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 247
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 256
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v26    # "minCells":I
a=0;//     .end local v27    # "minCellsAt":J
a=0;//     .end local v29    # "minCellsItemCount":I
a=0;//     :cond_1a
a=0;//     #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v38=(Conflicted);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 274
a=0;//     .restart local v13    # "expandCount":F
a=0;//     .restart local v31    # "singleItem":Z
a=0;//     :cond_1b
a=0;//     #v0=(Conflicted);v13=(Float);v31=(Boolean);v38=(Byte);v39=(LongHi);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 277
a=0;//     .restart local v15    # "extraPixels":I
a=0;//     :cond_1c
a=0;//     #v0=(Integer);v15=(Integer);v38=(Integer);
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v21
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-nez v38, :cond_1e
a=0;// 
a=0;//     .line 276
a=0;//     :cond_1d
a=0;//     :goto_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Integer);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1e
a=0;//     #v0=(LongLo);v1=(LongHi);v38=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 280
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 281
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     instance-of v0, v11, Lcom/actionbarsherlock/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_20
a=0;// 
a=0;//     .line 283
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v15, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 284
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 285
a=0;//     if-nez v21, :cond_1f
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_1f
a=0;// 
a=0;//     .line 288
a=0;//     neg-int v0, v15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     div-int/lit8 v38, v38, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 290
a=0;//     :cond_1f
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     .line 291
a=0;//     #v30=(One);
a=0;//     goto :goto_f
a=0;// 
a=0;//     :cond_20
a=0;//     #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_21
a=0;// 
a=0;//     .line 292
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v15, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 293
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 294
a=0;//     neg-int v0, v15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     div-int/lit8 v38, v38, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 295
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     .line 296
a=0;//     #v30=(One);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 300
a=0;//     :cond_21
a=0;//     #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
a=0;//     if-eqz v21, :cond_22
a=0;// 
a=0;//     .line 301
a=0;//     div-int/lit8 v38, v15, 0x2
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 303
a=0;//     :cond_22
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v38, v12, -0x1
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1d
a=0;// 
a=0;//     .line 304
a=0;//     div-int/lit8 v38, v15, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 316
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v13    # "expandCount":F
a=0;//     .end local v15    # "extraPixels":I
a=0;//     .end local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .restart local v20    # "heightSpec":I
a=0;//     :cond_23
a=0;//     #v1=(Integer);v11=(Conflicted);v13=(Conflicted);v15=(Conflicted);v20=(Integer);v23=(Conflicted);v35=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 317
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 319
a=0;//     .restart local v23    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_24
a=0;// 
a=0;//     .line 315
a=0;//     :goto_10
a=0;//     #v0=(Integer);v38=(Integer);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 321
a=0;//     :cond_24
a=0;//     #v0=(Boolean);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     mul-int v38, v38, v5
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v39, v0
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     add-int v35, v38, v39
a=0;// 
a=0;//     .line 322
a=0;//     .local v35, "width":I
a=0;//     #v35=(Integer);
a=0;//     const/high16 v38, 0x40000000    # 2.0f
a=0;// 
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v11, v0, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_10
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
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
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     .line 475
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 477
a=0;//     .local v0, "params":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 478
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     instance-of v1, p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 489
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     check-cast p1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;)V
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "result":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 491
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 495
a=0;//     .end local v0    # "result":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public generateOverflowButtonLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 504
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "result":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     .line 506
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWindowAnimations()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected hasDividerBeforeChildAt(I)Z
a=0;//     .locals 4
a=0;//     .param p1, "childIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 524
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 535
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 526
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     add-int/lit8 v3, p1, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 527
a=0;//     .local v1, "childBefore":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 528
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 529
a=0;//     .local v2, "result":Z
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge p1, v3, :cond_2
a=0;// 
a=0;//     instance-of v3, v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 530
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     .end local v1    # "childBefore":Landroid/view/View;
a=0;//     invoke-interface {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerAfter()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     .line 532
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Integer);
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     instance-of v3, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 533
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerBefore()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 518
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 519
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public invokeItem(Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->performItemAction(Lcom/actionbarsherlock/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isExpandedFormat()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mReserveOverflow:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->IS_FROYO:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 463
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 1
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     sget-boolean v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->IS_FROYO:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFirst:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFirst:Z
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->requestLayout()V
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 29
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-nez v27, :cond_1
a=0;// 
a=0;//     .line 382
a=0;//     invoke-super/range {p0 .. p5}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Integer);v28=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 386
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Boolean);v28=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 387
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     add-int v27, p3, p5
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     div-int/lit8 v14, v27, 0x2
a=0;// 
a=0;//     .line 388
a=0;//     .local v14, "midVertical":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 389
a=0;//     .local v7, "dividerWidth":I
a=0;//     #v7=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 391
a=0;//     .local v16, "overflowWidth":I
a=0;//     #v16=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 392
a=0;//     .local v15, "nonOverflowCount":I
a=0;//     #v15=(Null);
a=0;//     sub-int v27, p4, p2
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v26, v27, v28
a=0;// 
a=0;//     .line 393
a=0;//     .local v26, "widthRemaining":I
a=0;//     #v26=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 394
a=0;//     .local v8, "hasOverflow":Z
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Integer);v11=(Conflicted);v15=(Integer);v16=(Integer);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     if-lt v10, v6, :cond_2
a=0;// 
a=0;//     .line 427
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v6, v0, :cond_6
a=0;// 
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     .line 429
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 430
a=0;//     .local v24, "v":Landroid/view/View;
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 431
a=0;//     .local v25, "width":I
a=0;//     #v25=(Integer);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 432
a=0;//     .local v9, "height":I
a=0;//     #v9=(Integer);
a=0;//     sub-int v27, p4, p2
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     div-int/lit8 v13, v27, 0x2
a=0;// 
a=0;//     .line 433
a=0;//     .local v13, "midHorizontal":I
a=0;//     #v13=(Integer);
a=0;//     div-int/lit8 v27, v25, 0x2
a=0;// 
a=0;//     sub-int v11, v13, v27
a=0;// 
a=0;//     .line 434
a=0;//     .local v11, "l":I
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v27, v9, 0x2
a=0;// 
a=0;//     sub-int v23, v14, v27
a=0;// 
a=0;//     .line 435
a=0;//     .local v23, "t":I
a=0;//     #v23=(Integer);
a=0;//     add-int v27, v11, v25
a=0;// 
a=0;//     add-int v28, v23, v9
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v28
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v11, v1, v2, v3}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 395
a=0;//     .end local v9    # "height":I
a=0;//     .end local v11    # "l":I
a=0;//     .end local v13    # "midHorizontal":I
a=0;//     .end local v23    # "t":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     .end local v25    # "width":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v9=(Conflicted);v11=(Conflicted);v13=(Uninit);v23=(Conflicted);v24=(Conflicted);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 396
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     const/16 v28, 0x8
a=0;// 
a=0;//     #v28=(PosByte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 394
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v28=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 400
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(PosByte);v28=(PosByte);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 401
a=0;//     .local v17, "p":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_5
a=0;// 
a=0;//     .line 402
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 403
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->hasDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     .line 404
a=0;//     add-int/lit8 v16, v16, 0x0
a=0;// 
a=0;//     .line 407
a=0;//     :cond_4
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 408
a=0;//     .restart local v9    # "height":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     sub-int v18, v27, v28
a=0;// 
a=0;//     .line 409
a=0;//     .local v18, "r":I
a=0;//     #v18=(Integer);
a=0;//     sub-int v11, v18, v16
a=0;// 
a=0;//     .line 410
a=0;//     .restart local v11    # "l":I
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v27, v9, 0x2
a=0;// 
a=0;//     sub-int v23, v14, v27
a=0;// 
a=0;//     .line 411
a=0;//     .restart local v23    # "t":I
a=0;//     #v23=(Integer);
a=0;//     add-int v5, v23, v9
a=0;// 
a=0;//     .line 412
a=0;//     .local v5, "b":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v11, v1, v2, v5}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 414
a=0;//     sub-int v26, v26, v16
a=0;// 
a=0;//     .line 415
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 416
a=0;//     #v8=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 417
a=0;//     .end local v5    # "b":I
a=0;//     .end local v9    # "height":I
a=0;//     .end local v11    # "l":I
a=0;//     .end local v18    # "r":I
a=0;//     .end local v23    # "t":I
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v11=(Conflicted);v18=(Conflicted);v23=(Conflicted);v27=(Boolean);v28=(PosByte);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-int v27, v27, v28
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     add-int v19, v27, v28
a=0;// 
a=0;//     .line 419
a=0;//     .local v19, "size":I
a=0;//     #v19=(Integer);
a=0;//     sub-int v26, v26, v19
a=0;// 
a=0;//     .line 423
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 439
a=0;//     .end local v17    # "p":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v19    # "size":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v0=(One);v1=(Conflicted);v17=(Conflicted);v19=(Conflicted);v24=(Conflicted);v27=(One);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v27=(Boolean);
a=0;//     sub-int v20, v15, v27
a=0;// 
a=0;//     .line 440
a=0;//     .local v20, "spacerCount":I
a=0;//     #v20=(Integer);
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     if-lez v20, :cond_9
a=0;// 
a=0;//     div-int v27, v26, v20
a=0;// 
a=0;//     :goto_4
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 442
a=0;//     .local v21, "spacerSize":I
a=0;//     #v21=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 443
a=0;//     .local v22, "startLeft":I
a=0;//     #v22=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v12=(Conflicted);v25=(Conflicted);v28=(Integer);
a=0;//     if-ge v10, v6, :cond_0
a=0;// 
a=0;//     .line 444
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 445
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v12, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 446
a=0;//     .local v12, "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     const/16 v28, 0x8
a=0;// 
a=0;//     #v28=(PosByte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     iget-boolean v0, v12, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_a
a=0;// 
a=0;//     .line 443
a=0;//     :cond_7
a=0;//     :goto_6
a=0;//     #v0=(Integer);v1=(Integer);v27=(Integer);v28=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 439
a=0;//     .end local v12    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v20    # "spacerCount":I
a=0;//     .end local v21    # "spacerSize":I
a=0;//     .end local v22    # "startLeft":I
a=0;//     .end local v24    # "v":Landroid/view/View;
a=0;//     :cond_8
a=0;//     #v0=(One);v1=(Conflicted);v3=(Uninit);v4=(Uninit);v12=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Conflicted);v25=(Uninit);v27=(One);
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 440
a=0;//     .restart local v20    # "spacerCount":I
a=0;//     :cond_9
a=0;//     #v20=(Integer);v27=(Boolean);v28=(Null);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 450
a=0;//     .restart local v12    # "lp":Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .restart local v21    # "spacerSize":I
a=0;//     .restart local v22    # "startLeft":I
a=0;//     .restart local v24    # "v":Landroid/view/View;
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v1=(PosByte);v3=(Conflicted);v4=(Conflicted);v12=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;);v21=(Integer);v22=(Integer);v24=(Reference,Landroid/view/View;);v25=(Conflicted);v27=(Boolean);v28=(PosByte);
a=0;//     iget v0, v12, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v22, v22, v27
a=0;// 
a=0;//     .line 451
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 452
a=0;//     .restart local v25    # "width":I
a=0;//     #v25=(Integer);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 453
a=0;//     .restart local v9    # "height":I
a=0;//     #v9=(Integer);
a=0;//     div-int/lit8 v27, v9, 0x2
a=0;// 
a=0;//     sub-int v23, v14, v27
a=0;// 
a=0;//     .line 454
a=0;//     .restart local v23    # "t":I
a=0;//     #v23=(Integer);
a=0;//     add-int v27, v22, v25
a=0;// 
a=0;//     add-int v28, v23, v9
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v27
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v4, v28
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 455
a=0;//     iget v0, v12, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     add-int v27, v27, v25
a=0;// 
a=0;//     add-int v27, v27, v21
a=0;// 
a=0;//     add-int v22, v22, v27
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 101
a=0;//     #v4=(Null);
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "wasFormatted":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v5, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v2, v5, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     .line 104
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 111
a=0;//     .local v1, "widthSize":I
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 116
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 117
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->onMeasureExactFormat(II)V
a=0;// 
a=0;//     .line 121
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "widthSize":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Integer);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 102
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .restart local v1    # "widthSize":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Boolean);
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->onMeasure(II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setOverflowReserved(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "reserveOverflow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mReserveOverflow:Z
a=0;// 
a=0;//     .line 471
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPresenter(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)V
a=0;//     .locals 0
a=0;//     .param p1, "presenter"    # Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuView;->mPresenter:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
}}
