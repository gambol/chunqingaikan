package com.twocloo.com.cn.view; class HorizontalListView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// .super Landroid/widget/AdapterView;
a=0;// .source "HorizontalListView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/widget/AdapterView",
a=0;//         "<",
a=0;//         "Landroid/widget/ListAdapter;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field public mAlwaysOverrideTouch:Z
a=0;// 
a=0;// .field protected mCurrentX:I
a=0;// 
a=0;// .field private mDataChanged:Z
a=0;// 
a=0;// .field private mDataObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field private mDisplayOffset:I
a=0;// 
a=0;// .field private mGesture:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private mLeftViewIndex:I
a=0;// 
a=0;// .field private mMaxX:I
a=0;// 
a=0;// .field protected mNextX:I
a=0;// 
a=0;// .field private mOnGesture:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;// .field private mOnItemClicked:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field private mOnItemLongClicked:Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;// 
a=0;// .field private mOnItemSelected:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;// .field private mRemovedViewQueue:Ljava/util/Queue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Queue",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mRightViewIndex:I
a=0;// 
a=0;// .field protected mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/AdapterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAlwaysOverrideTouch:Z
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     .line 26
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     .line 29
a=0;//     const v0, 0x7fffffff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     .line 30
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRemovedViewQueue:Ljava/util/Queue;
a=0;// 
a=0;//     .line 37
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataChanged:Z
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/HorizontalListView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/HorizontalListView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/HorizontalListView$1;-><init>(Lcom/twocloo/com/cn/view/HorizontalListView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/HorizontalListView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/HorizontalListView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/HorizontalListView$2;-><init>(Lcom/twocloo/com/cn/view/HorizontalListView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnGesture:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->initView()V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/view/HorizontalListView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataChanged:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/view/HorizontalListView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->reset()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemClicked:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemSelected:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemSelectedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemLongClicked:Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemLongClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private addAndMeasureChild(Landroid/view/View;I)V
a=0;//     .locals 4
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "viewPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/high16 v3, -0x80000000
a=0;// 
a=0;//     .line 123
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "params":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .end local v0    # "params":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v0    # "params":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, p1, p2, v0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fillList(I)V
a=0;//     .locals 3
a=0;//     .param p1, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     .local v1, "edge":I
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, p1}, Lcom/twocloo/com/cn/view/HorizontalListView;->fillListRight(II)V
a=0;// 
a=0;//     .line 189
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 194
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, p1}, Lcom/twocloo/com/cn/view/HorizontalListView;->fillListLeft(II)V
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fillListLeft(II)V
a=0;//     .locals 4
a=0;//     .param p1, "leftEdge"    # I
a=0;//     .param p2, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     add-int v1, p1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 219
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ListAdapter;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRemovedViewQueue:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-interface {v2, v3, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->addAndMeasureChild(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr p1, v1
a=0;// 
a=0;//     .line 222
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     .line 223
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private fillListRight(II)V
a=0;//     .locals 4
a=0;//     .param p1, "rightEdge"    # I
a=0;//     .param p2, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     add-int v1, p1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ListAdapter;);
a=0;//     invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 201
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ListAdapter;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRemovedViewQueue:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-interface {v2, v3, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->addAndMeasureChild(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr p1, v1
a=0;// 
a=0;//     .line 205
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 206
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mCurrentX:I
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     .line 209
a=0;//     :cond_2
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     if-gez v1, :cond_3
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     .line 212
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized initView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     .line 47
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mCurrentX:I
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 50
a=0;//     const v0, 0x7fffffff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnGesture:Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/GestureDetector$OnGestureListener;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mGesture:Landroid/view/GestureDetector;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 53
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 45
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private positionItems(I)V
a=0;//     .locals 7
a=0;//     .param p1, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     add-int/2addr v4, p1
a=0;// 
a=0;//     iput v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     .line 250
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     .line 251
a=0;//     .local v3, "left":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-lt v2, v4, :cond_1
a=0;// 
a=0;//     .line 258
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "left":I
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 252
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "left":I
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 253
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 254
a=0;//     .local v1, "childWidth":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     add-int v5, v3, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v1
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     .line 251
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private removeNonVisibleItems(I)V
a=0;//     .locals 4
a=0;//     .param p1, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 239
a=0;//     :goto_1
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_3
a=0;// 
a=0;//     .line 245
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 230
a=0;//     :cond_2
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDisplayOffset:I
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRemovedViewQueue:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->removeViewInLayout(Landroid/view/View;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mLeftViewIndex:I
a=0;// 
a=0;//     .line 234
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     :cond_3
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRemovedViewQueue:Ljava/util/Queue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->removeViewInLayout(Landroid/view/View;)V
a=0;// 
a=0;//     .line 242
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mRightViewIndex:I
a=0;// 
a=0;//     .line 243
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized reset()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->initView()V
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->removeAllViewsInLayout()V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->requestLayout()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 115
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     invoke-super {p0, p1}, Landroid/widget/AdapterView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mGesture:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 269
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getAdapter()Landroid/widget/Adapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Landroid/widget/ListAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 282
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 283
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method protected onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 9
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 274
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     neg-float v3, p3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 273
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->requestLayout()V
a=0;// 
a=0;//     .line 278
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 273
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized onLayout(ZIIII)V
a=0;//     .locals 5
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/AdapterView;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Landroid/widget/ListAdapter;);v4=(Uninit);
a=0;//     iget-boolean v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataChanged:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 141
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mCurrentX:I
a=0;// 
a=0;//     .line 142
a=0;//     .local v1, "oldCurrentX":I
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->initView()V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->removeAllViewsInLayout()V
a=0;// 
a=0;//     .line 144
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 145
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataChanged:Z
a=0;// 
a=0;//     .line 148
a=0;//     .end local v1    # "oldCurrentX":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 150
a=0;//     .local v2, "scrollx":I
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 153
a=0;//     .end local v2    # "scrollx":I
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_4
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v3, v4, :cond_5
a=0;// 
a=0;//     .line 158
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mMaxX:I
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Scroller;->forceFinished(Z)V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mCurrentX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "dx":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->removeNonVisibleItems(I)V
a=0;// 
a=0;//     .line 165
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->fillList(I)V
a=0;// 
a=0;//     .line 166
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->positionItems(I)V
a=0;// 
a=0;//     .line 168
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     iput v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mCurrentX:I
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v3}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v3, Lcom/twocloo/com/cn/view/HorizontalListView$3;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/view/HorizontalListView$3;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/view/HorizontalListView$3;-><init>(Lcom/twocloo/com/cn/view/HorizontalListView;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView$3;);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     .end local v0    # "dx":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized scrollTo(I)V
a=0;//     .locals 5
a=0;//     .param p1, "x"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v3, p1, v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->requestLayout()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 263
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 261
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/view/HorizontalListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mDataObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/HorizontalListView;->reset()V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p1, "listener":Landroid/widget/AdapterView$OnItemClickListener;, "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemClicked:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     .local p1, "listener":Landroid/widget/AdapterView$OnItemLongClickListener;, "Landroid/widget/AdapterView$OnItemLongClickListener;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemLongClicked:Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p1, "listener":Landroid/widget/AdapterView$OnItemSelectedListener;, "Landroid/widget/AdapterView$OnItemSelectedListener;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView;->mOnItemSelected:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelection(I)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
}}
