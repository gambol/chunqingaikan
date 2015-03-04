package com.twocloo.com.cn.view; class DragGridView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/DragGridView;
a=0;// .super Landroid/widget/GridView;
a=0;// .source "DragGridView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final speed:I = 0x14
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private childCount:I
a=0;// 
a=0;// .field private dragResponseMS:J
a=0;// 
a=0;// .field private isDrag:Z
a=0;// 
a=0;// .field private ispress:Lcom/twocloo/com/cn/view/isPressCallback;
a=0;// 
a=0;// .field private listener:Lcom/twocloo/com/cn/view/PointCallBack;
a=0;// 
a=0;// .field private mAnimationEnd:Z
a=0;// 
a=0;// .field private mColumnWidth:I
a=0;// 
a=0;// .field private mDownScrollBorder:I
a=0;// 
a=0;// .field private mDownX:I
a=0;// 
a=0;// .field private mDownY:I
a=0;// 
a=0;// .field private mDragAdapter:Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;// .field private mDragBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mDragPosition:I
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHorizontalSpacing:I
a=0;// 
a=0;// .field private mLongClickRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mNumColumns:I
a=0;// 
a=0;// .field private mNumColumnsSet:Z
a=0;// 
a=0;// .field private mOffset2Left:I
a=0;// 
a=0;// .field private mOffset2Top:I
a=0;// 
a=0;// .field private mPoint2ItemLeft:I
a=0;// 
a=0;// .field private mPoint2ItemTop:I
a=0;// 
a=0;// .field private mScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;// .field private mStatusHeight:I
a=0;// 
a=0;// .field private mUpScrollBorder:I
a=0;// 
a=0;// .field private mVibrator:Landroid/os/Vibrator;
a=0;// 
a=0;// .field private mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;// .field private mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;// .field private moveX:I
a=0;// 
a=0;// .field private moveY:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/twocloo/com/cn/view/DragGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 148
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/DragGridView;->setChildrenDrawingOrderEnabled(Z)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/twocloo/com/cn/view/DragGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 153
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/DragGridView;->setChildrenDrawingOrderEnabled(Z)V
a=0;// 
a=0;//     .line 154
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
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 169
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     const-wide/16 v0, 0x258
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->dragResponseMS:J
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->isDrag:Z
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     .line 138
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mAnimationEnd:Z
a=0;// 
a=0;//     .line 181
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/DragGridView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/DragGridView$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/DragGridView$1;-><init>(Lcom/twocloo/com/cn/view/DragGridView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mLongClickRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 429
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/DragGridView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/DragGridView$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/DragGridView$2;-><init>(Lcom/twocloo/com/cn/view/DragGridView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/view/DragGridView;->setChildrenDrawingOrderEnabled(Z)V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v0, "vibrator"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Vibrator;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mVibrator:Landroid/os/Vibrator;
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/view/DragGridView;->getStatusHeight(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStatusHeight:I
a=0;// 
a=0;//     .line 175
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumnsSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->childCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/view/DragGridView;)Ljava/lang/Runnable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mUpScrollBorder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownScrollBorder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/view/DragGridView;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/view/DragGridView;->animateReorder(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/view/DragGridView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/view/DragGridView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mAnimationEnd:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/view/DragGridView;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->isDrag:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/view/DragGridView;)Landroid/os/Vibrator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mVibrator:Landroid/os/Vibrator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Vibrator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/view/DragGridView;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/view/DragGridView;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/view/DragGridView;Landroid/graphics/Bitmap;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/com/cn/view/DragGridView;->createDragImage(Landroid/graphics/Bitmap;II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/view/DragGridView;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private animateReorder(II)V
a=0;//     .locals 10
a=0;//     .param p1, "oldPosition"    # I
a=0;//     .param p2, "newPosition"    # I
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xb
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 511
a=0;//     #v3=(Null);
a=0;//     if-le p2, p1, :cond_1
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 512
a=0;//     .local v6, "isForward":Z
a=0;//     :goto_0
a=0;//     #v6=(Boolean);
a=0;//     new-instance v8, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 513
a=0;//     .local v8, "resultList":Ljava/util/List;, "Ljava/util/List<Landroid/animation/Animator;>;"
a=0;//     #v8=(Reference,Ljava/util/LinkedList;);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 514
a=0;//     move v7, p1
a=0;// 
a=0;//     .local v7, "pos":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     if-lt v7, p2, :cond_2
a=0;// 
a=0;//     .line 535
a=0;//     :cond_0
a=0;//     new-instance v9, Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/animation/AnimatorSet;);
a=0;//     invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 536
a=0;//     .local v9, "resultSet":Landroid/animation/AnimatorSet;
a=0;//     #v9=(Reference,Landroid/animation/AnimatorSet;);
a=0;//     invoke-virtual {v9, v8}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 537
a=0;//     const-wide/16 v2, 0x12c
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     .line 538
a=0;//     new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateDecelerateInterpolator;);
a=0;//     invoke-virtual {v9, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V
a=0;// 
a=0;//     .line 539
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/DragGridView$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/DragGridView$4;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/view/DragGridView$4;-><init>(Lcom/twocloo/com/cn/view/DragGridView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView$4;);
a=0;//     invoke-virtual {v9, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 550
a=0;//     invoke-virtual {v9}, Landroid/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     .line 551
a=0;//     return-void
a=0;// 
a=0;//     .line 511
a=0;//     .end local v6    # "isForward":Z
a=0;//     .end local v7    # "pos":I
a=0;//     .end local v8    # "resultList":Ljava/util/List;, "Ljava/util/List<Landroid/animation/Animator;>;"
a=0;//     .end local v9    # "resultSet":Landroid/animation/AnimatorSet;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 515
a=0;//     .restart local v6    # "isForward":Z
a=0;//     .restart local v7    # "pos":I
a=0;//     .restart local v8    # "resultList":Ljava/util/List;, "Ljava/util/List<Landroid/animation/Animator;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Integer);v8=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v7, v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/DragGridView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 516
a=0;//     .local v1, "view":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     invoke-virtual {v0, v7}, Ljava/io/PrintStream;->println(I)V
a=0;// 
a=0;//     .line 518
a=0;//     add-int/lit8 v0, v7, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int/2addr v0, v2
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 519
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/view/DragGridView;->createTranslationAnimations(Landroid/view/View;FFFF)Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 514
a=0;//     :goto_2
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 521
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/view/DragGridView;->createTranslationAnimations(Landroid/view/View;FFFF)Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 525
a=0;//     .end local v1    # "view":Landroid/view/View;
a=0;//     .end local v7    # "pos":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     move v7, p1
a=0;// 
a=0;//     .restart local v7    # "pos":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     if-le v7, p2, :cond_0
a=0;// 
a=0;//     .line 526
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, v7, v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/view/DragGridView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 527
a=0;//     .restart local v1    # "view":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     add-int/2addr v0, v7
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int/2addr v0, v2
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 528
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/view/DragGridView;->createTranslationAnimations(Landroid/view/View;FFFF)Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 525
a=0;//     :goto_4
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 530
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/view/DragGridView;->createTranslationAnimations(Landroid/view/View;FFFF)Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private createDragImage(Landroid/graphics/Bitmap;II)V
a=0;//     .locals 4
a=0;//     .param p1, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "downX"    # I
a=0;//     .param p3, "downY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 383
a=0;//     #v3=(Byte);
a=0;//     new-instance v0, Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/4 v1, -0x3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v1, 0x33
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemLeft:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, p2, v1
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I
a=0;// 
a=0;//     .line 387
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemTop:I
a=0;// 
a=0;//     sub-int v1, p3, v1
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Top:I
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStatusHeight:I
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const v1, 0x3f0ccccd    # 0.55f
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v1, 0x18
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 396
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createTranslationAnimations(Landroid/view/View;FFFF)Landroid/animation/AnimatorSet;
a=0;//     .locals 8
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "startX"    # F
a=0;//     .param p3, "endX"    # F
a=0;//     .param p4, "startY"    # F
a=0;//     .param p5, "endY"    # F
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xb
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 496
a=0;//     #v5=(Null);
a=0;//     const-string v3, "translationX"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v7, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aput p2, v4, v5
a=0;// 
a=0;//     aput p3, v4, v6
a=0;// 
a=0;//     invoke-static {p1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 497
a=0;//     .local v1, "animX":Landroid/animation/ObjectAnimator;
a=0;//     #v1=(Reference,Landroid/animation/ObjectAnimator;);
a=0;//     const-string v3, "translationY"
a=0;// 
a=0;//     new-array v4, v7, [F
a=0;// 
a=0;//     aput p4, v4, v5
a=0;// 
a=0;//     aput p5, v4, v6
a=0;// 
a=0;//     invoke-static {p1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 498
a=0;//     .local v2, "animY":Landroid/animation/ObjectAnimator;
a=0;//     #v2=(Reference,Landroid/animation/ObjectAnimator;);
a=0;//     new-instance v0, Landroid/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/animation/AnimatorSet;);
a=0;//     invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 499
a=0;//     .local v0, "animSetXY":Landroid/animation/AnimatorSet;
a=0;//     #v0=(Reference,Landroid/animation/AnimatorSet;);
a=0;//     new-array v3, v7, [Landroid/animation/Animator;
a=0;// 
a=0;//     aput-object v1, v3, v5
a=0;// 
a=0;//     aput-object v2, v3, v6
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V
a=0;// 
a=0;//     .line 500
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getStatusHeight(Landroid/content/Context;)I
a=0;//     .locals 7
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 573
a=0;//     .local v5, "statusHeight":I
a=0;//     #v5=(Null);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .local v4, "localRect":Landroid/graphics/Rect;
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object v6, p0
a=0;// 
a=0;//     .line 574
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     check-cast v6, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 575
a=0;//     iget v5, v4, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 576
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     :try_start_0
a=0;//     const-string v6, "com.android.internal.R$dimen"
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 580
a=0;//     .local v2, "localClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 581
a=0;//     .local v3, "localObject":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     const-string v6, "status_bar_height"
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 582
a=0;//     .local v1, "i5":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 588
a=0;//     .end local v1    # "i5":I
a=0;//     .end local v2    # "localClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v3    # "localObject":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 584
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 585
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isTouchInItem(Landroid/view/View;II)Z
a=0;//     .locals 4
a=0;//     .param p1, "dragView"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 336
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 339
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 340
a=0;//     .local v0, "leftOffset":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 341
a=0;//     .local v1, "topOffset":I
a=0;//     #v1=(Integer);
a=0;//     if-lt p2, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     if-gt p2, v3, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     if-lt p3, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     if-gt p3, v3, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onDragItem(II)V
a=0;//     .locals 3
a=0;//     .param p1, "moveX"    # I
a=0;//     .param p2, "moveY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemLeft:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, p1, v1
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I
a=0;// 
a=0;//     .line 416
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemTop:I
a=0;// 
a=0;//     sub-int v1, p2, v1
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Top:I
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStatusHeight:I
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowLayoutParams:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 418
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/view/DragGridView;->onSwapItem(II)V
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 422
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onStopDrag()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/view/DragGridView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 558
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 559
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 561
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragAdapter:Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {v1, v2}, Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;->setHideItem(I)V
a=0;// 
a=0;//     .line 562
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/DragGridView;->removeDragImage()V
a=0;// 
a=0;//     .line 563
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onSwapItem(II)V
a=0;//     .locals 4
a=0;//     .param p1, "moveX"    # I
a=0;//     .param p2, "moveY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/com/cn/view/DragGridView;->pointToPosition(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 464
a=0;//     .local v1, "tempPosition":I
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mAnimationEnd:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragAdapter:Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v2, v3, v1}, Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;->reorderItems(II)V
a=0;// 
a=0;//     .line 466
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragAdapter:Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     invoke-interface {v2, v1}, Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;->setHideItem(I)V
a=0;// 
a=0;//     .line 468
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 469
a=0;//     .local v0, "observer":Landroid/view/ViewTreeObserver;
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/view/DragGridView$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/view/DragGridView$3;);
a=0;//     invoke-direct {v2, p0, v0, v1}, Lcom/twocloo/com/cn/view/DragGridView$3;-><init>(Lcom/twocloo/com/cn/view/DragGridView;Landroid/view/ViewTreeObserver;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/DragGridView$3;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     .line 481
a=0;//     .end local v0    # "observer":Landroid/view/ViewTreeObserver;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private removeDragImage()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 404
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 324
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 273
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownX:I
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownY:I
a=0;// 
a=0;//     .line 277
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownX:I
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/view/DragGridView;->pointToPosition(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     .line 279
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 280
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 284
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mLongClickRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Runnable;);
a=0;//     iget-wide v4, p0, Lcom/twocloo/com/cn/view/DragGridView;->dragResponseMS:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 287
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/view/DragGridView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     .line 290
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemTop:I
a=0;// 
a=0;//     .line 291
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownX:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mPoint2ItemLeft:I
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownY:I
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Top:I
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mOffset2Left:I
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x5
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDownScrollBorder:I
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x5
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mUpScrollBorder:I
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->destroyDrawingCache()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v0, v2
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "moveX":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     float-to-int v1, v2
a=0;// 
a=0;//     .line 314
a=0;//     .local v1, "moveY":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mStartDragItemView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v2, v0, v1}, Lcom/twocloo/com/cn/view/DragGridView;->isTouchInItem(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mLongClickRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     .end local v0    # "moveX":I
a=0;//     .end local v1    # "moveY":I
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->ispress:Lcom/twocloo/com/cn/view/isPressCallback;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/isPressCallback;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, v3}, Lcom/twocloo/com/cn/view/isPressCallback;->isPress(Z)V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mLongClickRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->mScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 271
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 5
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 237
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mColumnWidth:I
a=0;// 
a=0;//     if-lez v2, :cond_4
a=0;// 
a=0;//     .line 238
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/DragGridView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 239
a=0;//     .local v0, "gridWidth":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mColumnWidth:I
a=0;// 
a=0;//     div-int v1, v0, v2
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "numFittedColumns":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 241
a=0;//     :goto_0
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 254
a=0;//     .end local v0    # "gridWidth":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     .line 257
a=0;//     .end local v1    # "numFittedColumns":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V
a=0;// 
a=0;//     .line 258
a=0;//     return-void
a=0;// 
a=0;//     .line 242
a=0;//     .restart local v0    # "gridWidth":I
a=0;//     .restart local v1    # "numFittedColumns":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(One);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->mColumnWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v2, v1
a=0;// 
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHorizontalSpacing:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     if-le v2, v0, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :cond_3
a=0;//     #v3=(Null);v4=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 251
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 252
a=0;//     .end local v0    # "gridWidth":I
a=0;//     .end local v1    # "numFittedColumns":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Byte);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .restart local v1    # "numFittedColumns":I
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 354
a=0;//     #v5=(Null);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->isDrag:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 370
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 357
a=0;//     :pswitch_0
a=0;//     #v0=(One);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveX:I
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveY:I
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->listener:Lcom/twocloo/com/cn/view/PointCallBack;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PointCallBack;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [D
a=0;// 
a=0;//     #v2=(Reference,[D);
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveX:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     aput-wide v3, v2, v5
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     aput-wide v3, v2, v0
a=0;// 
a=0;//     invoke-interface {v1, v2}, Lcom/twocloo/com/cn/view/PointCallBack;->getPoint([D)V
a=0;// 
a=0;//     .line 361
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveX:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView;->moveY:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v1, v2}, Lcom/twocloo/com/cn/view/DragGridView;->onDragItem(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/DragGridView;->onStopDrag()V
a=0;// 
a=0;//     .line 365
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/view/DragGridView;->isDrag:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 204
a=0;//     instance-of v0, p1, Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     check-cast p1, Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     .end local p1    # "adapter":Landroid/widget/ListAdapter;
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mDragAdapter:Lcom/twocloo/com/cn/adapters/DragGridBaseAdapter;
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     .restart local p1    # "adapter":Landroid/widget/ListAdapter;
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "the adapter must be implements DragGridAdapter"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setColumnWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "columnWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->setColumnWidth(I)V
a=0;// 
a=0;//     .line 221
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mColumnWidth:I
a=0;// 
a=0;//     .line 222
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDragResponseMS(J)V
a=0;//     .locals 0
a=0;//     .param p1, "dragResponseMS"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->dragResponseMS:J
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHorizontalSpacing(I)V
a=0;//     .locals 0
a=0;//     .param p1, "horizontalSpacing"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->setHorizontalSpacing(I)V
a=0;// 
a=0;//     .line 227
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mHorizontalSpacing:I
a=0;// 
a=0;//     .line 228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListener(Lcom/twocloo/com/cn/view/PointCallBack;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/view/PointCallBack;
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->listener:Lcom/twocloo/com/cn/view/PointCallBack;
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNumColumns(I)V
a=0;//     .locals 1
a=0;//     .param p1, "numColumns"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-super {p0, p1}, Landroid/widget/GridView;->setNumColumns(I)V
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumnsSet:Z
a=0;// 
a=0;//     .line 215
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->mNumColumns:I
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setchildCount(I)V
a=0;//     .locals 0
a=0;//     .param p1, "childCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->childCount:I
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setisPress(Lcom/twocloo/com/cn/view/isPressCallback;)V
a=0;//     .locals 0
a=0;//     .param p1, "presslistener"    # Lcom/twocloo/com/cn/view/isPressCallback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/DragGridView;->ispress:Lcom/twocloo/com/cn/view/isPressCallback;
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
}}
