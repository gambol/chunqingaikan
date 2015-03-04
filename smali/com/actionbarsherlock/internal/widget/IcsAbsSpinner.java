package com.actionbarsherlock.internal.widget; class IcsAbsSpinner { void a() { int a;
a=0;// .class public abstract Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;
a=0;// .super Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// .source "IcsAbsSpinner.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/actionbarsherlock/internal/widget/IcsAdapterView",
a=0;//         "<",
a=0;//         "Landroid/widget/SpinnerAdapter;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IS_HONEYCOMB:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// .field mBlockLayoutRequests:Z
a=0;// 
a=0;// .field private mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field mHeightMeasureSpec:I
a=0;// 
a=0;// .field final mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;// .field mSelectionBottomPadding:I
a=0;// 
a=0;// .field mSelectionLeftPadding:I
a=0;// 
a=0;// .field mSelectionRightPadding:I
a=0;// 
a=0;// .field mSelectionTopPadding:I
a=0;// 
a=0;// .field final mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private mTouchFrame:Landroid/graphics/Rect;
a=0;// 
a=0;// .field mWidthMeasureSpec:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->IS_HONEYCOMB:Z
a=0;// 
a=0;//     return-void
a=0;// 
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
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionLeftPadding:I
a=0;// 
a=0;//     .line 47
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionTopPadding:I
a=0;// 
a=0;//     .line 48
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionRightPadding:I
a=0;// 
a=0;//     .line 49
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionBottomPadding:I
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;-><init>(Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     .line 60
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->initAbsSpinner()V
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionLeftPadding:I
a=0;// 
a=0;//     .line 47
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionTopPadding:I
a=0;// 
a=0;//     .line 48
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionRightPadding:I
a=0;// 
a=0;//     .line 49
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionBottomPadding:I
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;-><init>(Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     .line 69
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->initAbsSpinner()V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;Landroid/view/View;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->removeDetachedView(Landroid/view/View;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initAbsSpinner()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setFocusable(Z)V
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .line 258
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 259
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     .line 257
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getAdapter()Landroid/widget/Adapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Landroid/widget/SpinnerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getChildHeight(Landroid/view/View;)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getChildWidth(Landroid/view/View;)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedView()Landroid/view/View;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 315
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 317
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method abstract layout(IZ)V
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 17
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 172
a=0;//     .local v13, "widthMode":I
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 173
a=0;//     .local v5, "mPaddingLeft":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getPaddingTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 174
a=0;//     .local v7, "mPaddingTop":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getPaddingRight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 175
a=0;//     .local v6, "mPaddingRight":I
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 177
a=0;//     .local v4, "mPaddingBottom":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionLeftPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-le v5, v0, :cond_6
a=0;// 
a=0;//     .end local v5    # "mPaddingLeft":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iput v5, v15, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 179
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionTopPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-le v7, v0, :cond_7
a=0;// 
a=0;//     .end local v7    # "mPaddingTop":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iput v7, v15, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 181
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionRightPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-le v6, v0, :cond_8
a=0;// 
a=0;//     .end local v6    # "mPaddingRight":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     iput v6, v15, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 183
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionBottomPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-le v4, v0, :cond_9
a=0;// 
a=0;//     .end local v4    # "mPaddingBottom":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     iput v4, v15, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 186
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-boolean v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->handleDataChanged()V
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 191
a=0;//     .local v9, "preferredHeight":I
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     .local v10, "preferredWidth":I
a=0;//     #v10=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 194
a=0;//     .local v8, "needsMeasuring":Z
a=0;//     #v8=(One);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 195
a=0;//     .local v11, "selectedPosition":I
a=0;//     #v11=(Integer);
a=0;//     if-ltz v11, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v15}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ge v11, v15, :cond_4
a=0;// 
a=0;//     .line 197
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     #v15=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     invoke-virtual {v15, v11}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->get(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 198
a=0;//     .local v12, "view":Landroid/view/View;
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     if-nez v12, :cond_1
a=0;// 
a=0;//     .line 200
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     invoke-interface {v15, v11, v0, v1}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);v1=(Conflicted);v16=(Integer);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     .line 205
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     invoke-virtual {v15, v11, v12}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->put(ILandroid/view/View;)V
a=0;// 
a=0;//     .line 208
a=0;//     :cond_2
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     if-nez v15, :cond_3
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 212
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 214
a=0;//     :cond_3
a=0;//     #v15=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v12, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->measureChild(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 216
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildHeight(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v15, v15, v16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v9, v15, v16
a=0;// 
a=0;//     .line 217
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     invoke-virtual {v0, v12}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildWidth(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v15, v15, v16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v10, v15, v16
a=0;// 
a=0;//     .line 219
a=0;//     #v10=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 223
a=0;//     .end local v12    # "view":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v8=(Boolean);v12=(Conflicted);v15=(Conflicted);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 225
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v15, v15, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v9, v15, v16
a=0;// 
a=0;//     .line 226
a=0;//     if-nez v13, :cond_5
a=0;// 
a=0;//     .line 227
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget-object v15, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v15=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v15, v15, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iget v0, v0, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     add-int v10, v15, v16
a=0;// 
a=0;//     .line 231
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getSuggestedMinimumHeight()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getSuggestedMinimumWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 234
a=0;//     sget-boolean v15, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->IS_HONEYCOMB:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_a
a=0;// 
a=0;//     .line 235
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v9, v0, v15}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resolveSizeAndState(III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 236
a=0;//     .local v3, "heightSize":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v10, v0, v15}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resolveSizeAndState(III)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 242
a=0;//     .local v14, "widthSize":I
a=0;//     :goto_4
a=0;//     #v14=(Integer);v15=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     invoke-virtual {v0, v14, v3}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 243
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mHeightMeasureSpec:I
a=0;// 
a=0;//     .line 244
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mWidthMeasureSpec:I
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// 
a=0;//     .line 178
a=0;//     .end local v3    # "heightSize":I
a=0;//     .end local v8    # "needsMeasuring":Z
a=0;//     .end local v9    # "preferredHeight":I
a=0;//     .end local v10    # "preferredWidth":I
a=0;//     .end local v11    # "selectedPosition":I
a=0;//     .end local v14    # "widthSize":I
a=0;//     .restart local v4    # "mPaddingBottom":I
a=0;//     .restart local v5    # "mPaddingLeft":I
a=0;//     .restart local v6    # "mPaddingRight":I
a=0;//     .restart local v7    # "mPaddingTop":I
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v15=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget v5, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionLeftPadding:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     .end local v5    # "mPaddingLeft":I
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget v7, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionTopPadding:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 182
a=0;//     .end local v7    # "mPaddingTop":I
a=0;//     :cond_8
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget v6, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionRightPadding:I
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 184
a=0;//     .end local v6    # "mPaddingRight":I
a=0;//     :cond_9
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;);
a=0;//     iget v4, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectionBottomPadding:I
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 238
a=0;//     .end local v4    # "mPaddingBottom":I
a=0;//     .restart local v8    # "needsMeasuring":Z
a=0;//     .restart local v9    # "preferredHeight":I
a=0;//     .restart local v10    # "preferredWidth":I
a=0;//     .restart local v11    # "selectedPosition":I
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v8=(Boolean);v9=(Integer);v10=(Integer);v11=(Integer);v12=(Conflicted);v15=(Boolean);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v9, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resolveSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 239
a=0;//     .restart local v3    # "heightSize":I
a=0;//     #v3=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v10, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resolveSize(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .restart local v14    # "widthSize":I
a=0;//     #v14=(Integer);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 6
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 434
a=0;//     #v5=(One);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "ss":Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-wide v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->selectedId:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 439
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     .line 440
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mNeedSync:Z
a=0;// 
a=0;//     .line 441
a=0;//     iget-wide v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->selectedId:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSyncRowId:J
a=0;// 
a=0;//     .line 442
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSyncPosition:I
a=0;// 
a=0;//     .line 443
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSyncMode:I
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->requestLayout()V
a=0;// 
a=0;//     .line 446
a=0;//     :cond_0
a=0;//     #v1=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 422
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;);
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 423
a=0;//     .local v0, "ss":Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getSelectedItemId()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->selectedId:J
a=0;// 
a=0;//     .line 424
a=0;//     iget-wide v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->selectedId:J
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->position:I
a=0;// 
a=0;//     .line 429
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v2=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$SavedState;->position:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public pointToPosition(II)I
a=0;//     .locals 5
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mTouchFrame:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 354
a=0;//     .local v2, "frame":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mTouchFrame:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mTouchFrame:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 359
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 360
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     if-gez v3, :cond_1
a=0;// 
a=0;//     .line 369
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 361
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 362
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {v2, p1, p2}, Landroid/graphics/Rect;->contains(II)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 365
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 360
a=0;//     :cond_2
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method recycleAllViews()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 264
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mRecycler:Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;// 
a=0;//     .line 265
a=0;//     .local v4, "recycleBin":Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     .line 268
a=0;//     .local v3, "position":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v1, v0, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 270
a=0;//     .local v5, "v":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     add-int v2, v3, v1
a=0;// 
a=0;//     .line 271
a=0;//     .local v2, "index":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v4, v2, v5}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner$RecycleBin;->put(ILandroid/view/View;)V
a=0;// 
a=0;//     .line 268
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 330
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->requestLayout()V
a=0;// 
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method resetList()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 146
a=0;//     #v2=(Byte);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataChanged:Z
a=0;// 
a=0;//     .line 147
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mNeedSync:Z
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->removeAllViewsInLayout()V
a=0;// 
a=0;//     .line 150
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 151
a=0;//     const-wide/high16 v0, -0x8000000000000000L
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->invalidate()V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 3
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v1, v2}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resetList()V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .line 111
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 112
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 115
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldItemCount:I
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     invoke-interface {v1}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->checkFocus()V
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;);
a=0;//     invoke-direct {v1, p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;-><init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$AdapterDataSetObserver;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v1, v2}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "position":I
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mItemCount:I
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 139
a=0;//     .end local v0    # "position":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->requestLayout()V
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);v2=(LongHi);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->checkFocus()V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->resetList()V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->checkSelectionChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSelection(I)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 288
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->requestLayout()V
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->invalidate()V
a=0;// 
a=0;//     .line 290
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelection(IZ)V
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v1, p1, :cond_0
a=0;// 
a=0;//     .line 281
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mFirstPosition:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 280
a=0;//     if-gt p1, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "shouldAnimate":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setSelectionInt(IZ)V
a=0;// 
a=0;//     .line 283
a=0;//     return-void
a=0;// 
a=0;//     .line 280
a=0;//     .end local v0    # "shouldAnimate":Z
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setSelectionInt(IZ)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mOldSelectedPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq p1, v1, :cond_0
a=0;// 
a=0;//     .line 302
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 303
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mSelectedPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, p1, v1
a=0;// 
a=0;//     .line 304
a=0;//     .local v0, "delta":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 305
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->layout(IZ)V
a=0;// 
a=0;//     .line 306
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsAbsSpinner;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 308
a=0;//     .end local v0    # "delta":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return-void
a=0;// .end method
}}
