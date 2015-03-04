package com.actionbarsherlock.internal.widget; class IcsProgressBar { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// .super Landroid/view/View;
a=0;// .source "IcsProgressBar.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation runtime Landroid/widget/RemoteViews$RemoteView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;,
a=0;//         Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ANIMATION_RESOLUTION:I = 0xc8
a=0;// 
a=0;// .field private static final IS_HONEYCOMB:Z
a=0;// 
a=0;// .field private static final MAX_LEVEL:I = 0x2710
a=0;// 
a=0;// .field private static final ProgressBar:[I
a=0;// 
a=0;// .field private static final ProgressBar_animationResolution:I = 0xe
a=0;// 
a=0;// .field private static final ProgressBar_indeterminate:I = 0x5
a=0;// 
a=0;// .field private static final ProgressBar_indeterminateBehavior:I = 0xa
a=0;// 
a=0;// .field private static final ProgressBar_indeterminateDrawable:I = 0x7
a=0;// 
a=0;// .field private static final ProgressBar_indeterminateDuration:I = 0x9
a=0;// 
a=0;// .field private static final ProgressBar_indeterminateOnly:I = 0x6
a=0;// 
a=0;// .field private static final ProgressBar_interpolator:I = 0xd
a=0;// 
a=0;// .field private static final ProgressBar_max:I = 0x2
a=0;// 
a=0;// .field private static final ProgressBar_maxHeight:I = 0x1
a=0;// 
a=0;// .field private static final ProgressBar_maxWidth:I = 0x0
a=0;// 
a=0;// .field private static final ProgressBar_minHeight:I = 0xc
a=0;// 
a=0;// .field private static final ProgressBar_minWidth:I = 0xb
a=0;// 
a=0;// .field private static final ProgressBar_progress:I = 0x3
a=0;// 
a=0;// .field private static final ProgressBar_progressDrawable:I = 0x8
a=0;// 
a=0;// .field private static final ProgressBar_secondaryProgress:I = 0x4
a=0;// 
a=0;// .field private static final TIMEOUT_SEND_ACCESSIBILITY_EVENT:I = 0xc8
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;// .field private mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;// .field private mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;// .field private mAnimationResolution:I
a=0;// 
a=0;// .field private mBehavior:I
a=0;// 
a=0;// .field private mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mDuration:I
a=0;// 
a=0;// .field private mInDrawing:Z
a=0;// 
a=0;// .field private mIndeterminate:Z
a=0;// 
a=0;// .field private mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mIndeterminateRealLeft:I
a=0;// 
a=0;// .field private mIndeterminateRealTop:I
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mLastDrawTime:J
a=0;// 
a=0;// .field private mMax:I
a=0;// 
a=0;// .field mMaxHeight:I
a=0;// 
a=0;// .field mMaxWidth:I
a=0;// 
a=0;// .field mMinHeight:I
a=0;// 
a=0;// .field mMinWidth:I
a=0;// 
a=0;// .field private mNoInvalidate:Z
a=0;// 
a=0;// .field private mOnlyIndeterminate:Z
a=0;// 
a=0;// .field private mProgress:I
a=0;// 
a=0;// .field private mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;// .field mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mSecondaryProgress:I
a=0;// 
a=0;// .field private mShouldStartAnimationDrawable:Z
a=0;// 
a=0;// .field private mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;// .field private mUiThreadId:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
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
a=0;//     sput-boolean v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->IS_HONEYCOMB:Z
a=0;// 
a=0;//     .line 192
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->ProgressBar:[I
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(Unknown);v1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x101011f
a=0;//         0x1010120
a=0;//         0x1010136
a=0;//         0x1010137
a=0;//         0x1010138
a=0;//         0x1010139
a=0;//         0x101013a
a=0;//         0x101013b
a=0;//         0x101013c
a=0;//         0x101013d
a=0;//         0x101013e
a=0;//         0x101013f
a=0;//         0x1010140
a=0;//         0x1010141
a=0;//         0x101031a
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 266
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     const v0, 0x1010077
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 270
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
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
a=0;//     .line 273
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     .line 274
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;//     .param p4, "styleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 280
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 281
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mUiThreadId:J
a=0;// 
a=0;//     .line 282
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->initProgressBar()V
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v5, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->ProgressBar:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v5, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 287
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mNoInvalidate:Z
a=0;// 
a=0;//     .line 289
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 290
a=0;//     .local v1, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 291
a=0;//     invoke-direct {p0, v1, v3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     const/16 v5, 0x9
a=0;// 
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mDuration:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mDuration:I
a=0;// 
a=0;//     .line 300
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinWidth:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinWidth:I
a=0;// 
a=0;//     .line 301
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxWidth:I
a=0;// 
a=0;//     invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxWidth:I
a=0;// 
a=0;//     .line 302
a=0;//     const/16 v5, 0xc
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinHeight:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinHeight:I
a=0;// 
a=0;//     .line 303
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     .line 305
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mBehavior:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mBehavior:I
a=0;// 
a=0;//     .line 308
a=0;//     const/16 v5, 0xd
a=0;// 
a=0;//     .line 309
a=0;//     #v5=(PosByte);
a=0;//     const v6, 0x10a000b
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 310
a=0;//     .local v2, "resID":I
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 311
a=0;//     invoke-virtual {p0, p1, v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setInterpolator(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 314
a=0;//     :cond_1
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setMax(I)V
a=0;// 
a=0;//     .line 316
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 319
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 318
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setSecondaryProgress(I)V
a=0;// 
a=0;//     .line 321
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 322
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 323
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 328
a=0;//     :cond_2
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     .line 327
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     .line 330
a=0;//     iput-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mNoInvalidate:Z
a=0;// 
a=0;//     .line 332
a=0;//     iget-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 333
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     iget-boolean v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     .line 332
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 333
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 335
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     .line 336
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     .line 335
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimationResolution:I
a=0;// 
a=0;//     .line 338
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 340
a=0;//     const-string v3, "accessibility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Null);v4=(One);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 333
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;IIZZ)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized doRefreshProgress(IIZZ)V
a=0;//     .locals 7
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;//     .param p4, "callBackToApp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 628
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     int-to-float v5, p2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v4, v5, v6
a=0;// 
a=0;//     .line 629
a=0;//     .local v4, "scale":F
a=0;//     :goto_0
a=0;//     #v4=(Float);v5=(Integer);v6=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 630
a=0;//     .local v1, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 631
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 633
a=0;//     .local v3, "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v3=(Null);
a=0;//     instance-of v5, v1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 634
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v0, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     invoke-virtual {v5, p1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 637
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Reference,Landroid/graphics/drawable/Drawable;);v5=(Conflicted);
a=0;//     const v5, 0x461c4000    # 10000.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v4
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v2, v5
a=0;// 
a=0;//     .line 638
a=0;//     .local v2, "level":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .end local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;// 
a=0;//     .line 643
a=0;//     .end local v2    # "level":I
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Integer);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     const v5, 0x102000d
a=0;// 
a=0;//     if-ne p1, v5, :cond_1
a=0;// 
a=0;//     .line 644
a=0;//     invoke-virtual {p0, v4, p3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->onProgressRefresh(FZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 646
a=0;//     :cond_1
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 628
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v4    # "scale":F
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v2    # "level":I
a=0;//     .restart local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v4    # "scale":F
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Integer);v3=(Reference,Landroid/graphics/drawable/Drawable;);v4=(Float);v5=(Float);v6=(Conflicted);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     .line 638
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 640
a=0;//     .end local v2    # "level":I
a=0;//     .end local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->invalidate()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 628
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v4    # "scale":F
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private initProgressBar()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x30
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0x18
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 437
a=0;//     #v1=(Null);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     .line 438
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     .line 439
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     .line 440
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     .line 441
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     .line 442
a=0;//     const/16 v0, 0xfa0
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mDuration:I
a=0;// 
a=0;//     .line 443
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mBehavior:I
a=0;// 
a=0;//     .line 444
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinWidth:I
a=0;// 
a=0;//     .line 445
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxWidth:I
a=0;// 
a=0;//     .line 446
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinHeight:I
a=0;// 
a=0;//     .line 447
a=0;//     iput v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized refreshProgress(IIZ)V
a=0;//     .locals 5
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 655
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mUiThreadId:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->doRefreshProgress(IIZZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 671
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 659
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Byte);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 661
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     .line 663
a=0;//     .local v0, "r":Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     .line 664
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->setup(IIZ)V
a=0;// 
a=0;//     .line 669
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 655
a=0;//     .end local v0    # "r":Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 667
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v2=(LongHi);v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;-><init>(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;IIZ)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .restart local v0    # "r":Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private scheduleAccessibilityEventSender()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1177
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1178
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;-><init>(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     .line 1182
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     const-wide/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 1183
a=0;//     return-void
a=0;// 
a=0;//     .line 1180
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 12
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p2, "clip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 349
a=0;//     #v10=(One);
a=0;//     instance-of v9, p1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 350
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     .line 351
a=0;//     .local v1, "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v6, v0, [Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 354
a=0;//     .local v6, "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     #v6=(Reference,[Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     if-lt v3, v0, :cond_0
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v5, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 362
a=0;//     .local v5, "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     #v5=(Reference,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     if-lt v3, v0, :cond_2
a=0;// 
a=0;//     .line 393
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v6    # "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     .end local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 355
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v1    # "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v6    # "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     .restart local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/graphics/drawable/LayerDrawable;);v2=(Uninit);v3=(Integer);v5=(Uninit);v6=(Reference,[Landroid/graphics/drawable/Drawable;);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 356
a=0;//     .local v4, "id":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 357
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const v9, 0x102000d
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v4, v9, :cond_1
a=0;// 
a=0;//     const v9, 0x102000f
a=0;// 
a=0;//     if-eq v4, v9, :cond_1
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 356
a=0;//     :goto_3
a=0;//     #v9=(Boolean);
a=0;//     invoke-direct {p0, v11, v9}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     aput-object v9, v6, v3
a=0;// 
a=0;//     .line 354
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v9=(Integer);
a=0;//     move v9, v10
a=0;// 
a=0;//     .line 357
a=0;//     #v9=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 363
a=0;//     .end local v4    # "id":I
a=0;//     .restart local v5    # "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Reference,Landroid/graphics/drawable/LayerDrawable;);v9=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v5, v3, v9}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V
a=0;// 
a=0;//     .line 362
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 377
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v6    # "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Boolean);v11=(Uninit);
a=0;//     instance-of v9, p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 378
a=0;//     check-cast p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     .end local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 379
a=0;//     .local v8, "tileBitmap":Landroid/graphics/Bitmap;
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     .line 380
a=0;//     iput-object v8, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 383
a=0;//     :cond_4
a=0;//     new-instance v7, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v7, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     .line 385
a=0;//     .local v7, "shapeDrawable":Landroid/graphics/drawable/ShapeDrawable;
a=0;//     #v7=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v2, Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     .line 386
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapShader;);
a=0;//     sget-object v9, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     .line 385
a=0;//     #v11=(Reference,Landroid/graphics/Shader$TileMode;);
a=0;//     invoke-direct {v2, v8, v9, v11}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V
a=0;// 
a=0;//     .line 387
a=0;//     .local v2, "bitmapShader":Landroid/graphics/BitmapShader;
a=0;//     #v2=(Reference,Landroid/graphics/BitmapShader;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
a=0;// 
a=0;//     .line 389
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     new-instance v9, Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/graphics/drawable/ClipDrawable;);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     .line 390
a=0;//     #v11=(PosByte);
a=0;//     invoke-direct {v9, v7, v11, v10}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/ClipDrawable;);
a=0;//     move-object v7, v9
a=0;// 
a=0;//     .end local v7    # "shapeDrawable":Landroid/graphics/drawable/ShapeDrawable;
a=0;//     :cond_5
a=0;//     #v11=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 389
a=0;//     #v5=(Reference,Ujava/lang/Object;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v2    # "bitmapShader":Landroid/graphics/BitmapShader;
a=0;//     .end local v8    # "tileBitmap":Landroid/graphics/Bitmap;
a=0;//     .restart local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_6
a=0;//     #v2=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Boolean);v11=(Uninit);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     .line 393
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 8
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     .line 407
a=0;//     #v7=(PosShort);
a=0;//     instance-of v5, p1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 408
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     .line 409
a=0;//     .local v1, "background":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 410
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v4, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/drawable/AnimationDrawable;);
a=0;//     invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V
a=0;// 
a=0;//     .line 411
a=0;//     .local v4, "newBg":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     #v4=(Reference,Landroid/graphics/drawable/AnimationDrawable;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V
a=0;// 
a=0;//     .line 413
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Integer);v6=(Conflicted);
a=0;//     if-lt v3, v0, :cond_1
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v4, v7}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z
a=0;// 
a=0;//     .line 419
a=0;//     move-object p1, v4
a=0;// 
a=0;//     .line 421
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "newBg":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 414
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v1    # "background":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "newBg":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/graphics/drawable/AnimationDrawable;);v3=(Integer);v4=(Reference,Landroid/graphics/drawable/AnimationDrawable;);
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {p0, v5, v6}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 415
a=0;//     .local v2, "frame":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v2, v5}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 413
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateDrawableBounds(II)V
a=0;//     .locals 16
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 965
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int v11, p1, v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     sub-int v8, v11, v12
a=0;// 
a=0;//     .line 966
a=0;//     .local v8, "right":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     sub-int v11, p2, v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingTop()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     sub-int v1, v11, v12
a=0;// 
a=0;//     .line 967
a=0;//     .local v1, "bottom":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 968
a=0;//     .local v9, "top":I
a=0;//     #v9=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 970
a=0;//     .local v7, "left":I
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     .line 972
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v11, v11, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_0
a=0;// 
a=0;//     .line 975
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 976
a=0;//     .local v6, "intrinsicWidth":I
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 977
a=0;//     .local v5, "intrinsicHeight":I
a=0;//     #v5=(Integer);
a=0;//     int-to-float v11, v6
a=0;// 
a=0;//     #v11=(Float);
a=0;//     int-to-float v12, v5
a=0;// 
a=0;//     #v12=(Float);
a=0;//     div-float v4, v11, v12
a=0;// 
a=0;//     .line 978
a=0;//     .local v4, "intrinsicAspect":F
a=0;//     #v4=(Float);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v11, v0
a=0;// 
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     int-to-float v12, v0
a=0;// 
a=0;//     div-float v2, v11, v12
a=0;// 
a=0;//     .line 979
a=0;//     .local v2, "boundAspect":F
a=0;//     #v2=(Float);
a=0;//     cmpl-float v11, v4, v2
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     .line 980
a=0;//     cmpl-float v11, v2, v4
a=0;// 
a=0;//     if-lez v11, :cond_3
a=0;// 
a=0;//     .line 982
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     int-to-float v11, v0
a=0;// 
a=0;//     #v11=(Float);
a=0;//     mul-float/2addr v11, v4
a=0;// 
a=0;//     float-to-int v10, v11
a=0;// 
a=0;//     .line 983
a=0;//     .local v10, "width":I
a=0;//     #v10=(Integer);
a=0;//     sub-int v11, p1, v10
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v7, v11, 0x2
a=0;// 
a=0;//     .line 984
a=0;//     #v7=(Integer);
a=0;//     add-int v8, v7, v10
a=0;// 
a=0;//     .line 993
a=0;//     .end local v2    # "boundAspect":F
a=0;//     .end local v4    # "intrinsicAspect":F
a=0;//     .end local v5    # "intrinsicHeight":I
a=0;//     .end local v6    # "intrinsicWidth":I
a=0;//     .end local v10    # "width":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Integer);v10=(Conflicted);v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     sub-int v14, v8, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-int v15, v1, v9
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 994
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v7, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateRealLeft:I
a=0;// 
a=0;//     .line 995
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v9, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateRealTop:I
a=0;// 
a=0;//     .line 998
a=0;//     :cond_1
a=0;//     #v12=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 999
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v11, v12, v13, v8, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 1001
a=0;//     :cond_2
a=0;//     #v12=(Integer);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 987
a=0;//     .restart local v2    # "boundAspect":F
a=0;//     .restart local v4    # "intrinsicAspect":F
a=0;//     .restart local v5    # "intrinsicHeight":I
a=0;//     .restart local v6    # "intrinsicWidth":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Float);v3=(Uninit);v4=(Float);v5=(Integer);v6=(Integer);v7=(Null);v9=(Null);v10=(Uninit);v11=(Byte);v12=(Float);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     int-to-float v11, v0
a=0;// 
a=0;//     #v11=(Float);
a=0;//     const/high16 v12, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     div-float/2addr v12, v4
a=0;// 
a=0;//     #v12=(Float);
a=0;//     mul-float/2addr v11, v12
a=0;// 
a=0;//     float-to-int v3, v11
a=0;// 
a=0;//     .line 988
a=0;//     .local v3, "height":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v11, p2, v3
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v9, v11, 0x2
a=0;// 
a=0;//     .line 989
a=0;//     #v9=(Integer);
a=0;//     add-int v1, v9, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateDrawableState()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1067
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1069
a=0;//     .local v0, "state":[I
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1070
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 1073
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1074
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 1076
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1062
a=0;//     invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V
a=0;// 
a=0;//     .line 1063
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->updateDrawableState()V
a=0;// 
a=0;//     .line 1064
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method getCurrentDrawable()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 397
a=0;//     #v2=(Null);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     .line 398
a=0;//     .local v0, "roundedCorners":[F
a=0;//     new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v1, v0, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 397
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//         0x40a00000    # 5.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterpolator()Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 899
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getMax()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "progress"
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getProgress()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "progress"
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 752
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getProgressDrawable()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getSecondaryProgress()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "progress"
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 769
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized incrementProgressBy(I)V
a=0;//     .locals 1
a=0;//     .param p1, "diff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 818
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgress(I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 819
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 818
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized incrementSecondaryProgressBy(I)V
a=0;//     .locals 1
a=0;//     .param p1, "diff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 829
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setSecondaryProgress(I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 830
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 829
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 7
a=0;//     .param p1, "dr"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 934
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInDrawing:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 935
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 936
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 937
a=0;//     .local v0, "dirty":Landroid/graphics/Rect;
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v1, v3, v4
a=0;// 
a=0;//     .line 938
a=0;//     .local v1, "scrollX":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int v2, v3, v4
a=0;// 
a=0;//     .line 940
a=0;//     .local v2, "scrollY":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, v0, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iget v4, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     add-int/2addr v4, v2
a=0;// 
a=0;//     .line 941
a=0;//     iget v5, v0, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v1
a=0;// 
a=0;//     iget v6, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v6, v2
a=0;// 
a=0;//     .line 940
a=0;//     invoke-virtual {p0, v3, v4, v5, v6}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->invalidate(IIII)V
a=0;// 
a=0;//     .line 946
a=0;//     .end local v0    # "dirty":Landroid/graphics/Rect;
a=0;//     .end local v1    # "scrollX":I
a=0;//     .end local v2    # "scrollY":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 943
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized isIndeterminate()Z
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "progress"
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public jumpDrawablesToCurrentState()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
a=0;// 
a=0;//     .line 590
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
a=0;// 
a=0;//     .line 591
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1140
a=0;//     invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 1141
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1142
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation()V
a=0;// 
a=0;//     .line 1144
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1148
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1149
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->stopAnimation()V
a=0;// 
a=0;//     .line 1151
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1152
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mRefreshProgressRunnable:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1154
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1155
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityEventSender:Lcom/actionbarsherlock/internal/widget/IcsProgressBar$AccessibilityEventSender;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1159
a=0;//     :cond_2
a=0;//     invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 1160
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1005
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 1007
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1008
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1011
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 1012
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateRealLeft:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateRealTop:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getDrawingTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 1014
a=0;//     .local v2, "time":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1015
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Transformation;);
a=0;//     invoke-virtual {v4, v2, v3, v5}, Landroid/view/animation/AlphaAnimation;->getTransformation(JLandroid/view/animation/Transformation;)Z
a=0;// 
a=0;//     .line 1016
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/animation/Transformation;->getAlpha()F
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1018
a=0;//     .local v1, "scale":F
a=0;//     #v1=(Float);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInDrawing:Z
a=0;// 
a=0;//     .line 1019
a=0;//     const v4, 0x461c4000    # 10000.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1021
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInDrawing:Z
a=0;// 
a=0;//     .line 1023
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-wide v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mLastDrawTime:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long/2addr v4, v6
a=0;// 
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimationResolution:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     .line 1024
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iput-wide v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mLastDrawTime:J
a=0;// 
a=0;//     .line 1025
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimationResolution:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-virtual {p0, v4, v5}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidateDelayed(J)V
a=0;// 
a=0;//     .line 1028
a=0;//     .end local v1    # "scale":F
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 1029
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 1030
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     instance-of v4, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1031
a=0;//     check-cast v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V
a=0;// 
a=0;//     .line 1032
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mShouldStartAnimationDrawable:Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 1035
a=0;//     .end local v2    # "time":J
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 1020
a=0;//     .restart local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v1    # "scale":F
a=0;//     .restart local v2    # "time":J
a=0;//     :catchall_0
a=0;//     #v1=(Float);v2=(LongLo);v3=(LongHi);v4=(Integer);v5=(Reference,Landroid/view/animation/Transformation;);v6=(Integer);v7=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 1021
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(Null);
a=0;//     iput-boolean v5, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInDrawing:Z
a=0;// 
a=0;//     .line 1022
a=0;//     throw v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 1005
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "scale":F
a=0;//     .end local v2    # "time":J
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1164
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 1165
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V
a=0;// 
a=0;//     .line 1166
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setCurrentItemIndex(I)V
a=0;// 
a=0;//     .line 1167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1039
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1041
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1042
a=0;//     .local v2, "dw":I
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1043
a=0;//     .local v1, "dh":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1044
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1045
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMinHeight:I
a=0;// 
a=0;//     iget v4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1047
a=0;//     :cond_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->updateDrawableState()V
a=0;// 
a=0;//     .line 1048
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     .line 1049
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     .line 1051
a=0;//     sget-boolean v3, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->IS_HONEYCOMB:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1052
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, p1, v3}, Landroid/view/View;->resolveSizeAndState(III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1053
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1, p2, v4}, Landroid/view/View;->resolveSizeAndState(III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1052
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setMeasuredDimension(II)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 1058
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 1055
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, p1}, Landroid/view/View;->resolveSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1056
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1055
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setMeasuredDimension(II)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1039
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "dh":I
a=0;//     .end local v2    # "dw":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method onProgressRefresh(FZ)V
a=0;//     .locals 1
a=0;//     .param p1, "scale"    # F
a=0;//     .param p2, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 650
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->scheduleAccessibilityEventSender()V
a=0;// 
a=0;//     .line 652
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1131
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;// 
a=0;//     .line 1132
a=0;//     .local v0, "ss":Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1134
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->progress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 1135
a=0;//     iget v1, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setSecondaryProgress(I)V
a=0;// 
a=0;//     .line 1136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1120
a=0;//     invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1121
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;);
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1123
a=0;//     .local v0, "ss":Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->progress:I
a=0;// 
a=0;//     .line 1124
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     iput v2, v0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     .line 1126
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 960
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->updateDrawableBounds(II)V
a=0;// 
a=0;//     .line 961
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onVisibilityChanged(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "changedView"    # Landroid/view/View;
a=0;//     .param p2, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 920
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 922
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 924
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 925
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->stopAnimation()V
a=0;// 
a=0;//     .line 930
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 927
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public postInvalidate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mNoInvalidate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     invoke-super {p0}, Landroid/view/View;->postInvalidate()V
a=0;// 
a=0;//     .line 598
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setIndeterminate(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 472
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     .line 474
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 477
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 483
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 479
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 480
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->stopAnimation()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 471
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 508
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 509
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 511
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 512
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 513
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 514
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidate()V
a=0;// 
a=0;//     .line 516
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "resID"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 880
a=0;//     invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 881
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 0
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 890
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 891
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setMax(I)V
a=0;//     .locals 3
a=0;//     .param p1, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 796
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 797
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 799
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     .line 800
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     .line 801
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidate()V
a=0;// 
a=0;//     .line 803
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     if-le v0, p1, :cond_1
a=0;// 
a=0;//     .line 804
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     .line 806
a=0;//     :cond_1
a=0;//     const v0, 0x102000d
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->refreshProgress(IIZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 808
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 796
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setProgress(I)V
a=0;//     .locals 1
a=0;//     .param p1, "progress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 685
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->setProgress(IZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 686
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 685
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method declared-synchronized setProgress(IZ)V
a=0;//     .locals 2
a=0;//     .param p1, "progress"    # I
a=0;//     .param p2, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 693
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-gez p1, :cond_2
a=0;// 
a=0;//     .line 694
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 697
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_3
a=0;// 
a=0;//     .line 698
a=0;//     iget p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     .line 701
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 702
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     .line 703
a=0;//     const v0, 0x102000d
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1, p2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->refreshProgress(IIZ)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 689
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 5
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 542
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eq p1, v2, :cond_3
a=0;// 
a=0;//     .line 543
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 544
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 549
a=0;//     .local v1, "needUpdate":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 550
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 553
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 554
a=0;//     .local v0, "drawableHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMaxHeight:I
a=0;// 
a=0;//     .line 556
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->requestLayout()V
a=0;// 
a=0;//     .line 559
a=0;//     .end local v0    # "drawableHeight":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 560
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 561
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 562
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidate()V
a=0;// 
a=0;//     .line 565
a=0;//     :cond_1
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 566
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->updateDrawableBounds(II)V
a=0;// 
a=0;//     .line 567
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->updateDrawableState()V
a=0;// 
a=0;//     .line 568
a=0;//     const v2, 0x102000d
a=0;// 
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgress:I
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     .line 569
a=0;//     const v2, 0x102000f
a=0;// 
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     .line 571
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 546
a=0;//     .end local v1    # "needUpdate":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Landroid/graphics/drawable/Drawable;);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "needUpdate":Z
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setSecondaryProgress(I)V
a=0;//     .locals 3
a=0;//     .param p1, "secondaryProgress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 720
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 736
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 724
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-gez p1, :cond_2
a=0;// 
a=0;//     .line 725
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 728
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_3
a=0;// 
a=0;//     .line 729
a=0;//     iget p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mMax:I
a=0;// 
a=0;//     .line 732
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 733
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     .line 734
a=0;//     const v0, 0x102000f
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mSecondaryProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->refreshProgress(IIZ)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 720
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
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 904
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 905
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 907
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 909
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 910
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->stopAnimation()V
a=0;// 
a=0;//     .line 916
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 912
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->startAnimation()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method startAnimation()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 836
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 857
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v0, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 841
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     .line 842
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 856
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 844
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 845
a=0;//     new-instance v0, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 848
a=0;//     :cond_2
a=0;//     new-instance v0, Landroid/view/animation/Transformation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/Transformation;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/Transformation;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Transformation;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .line 849
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 850
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mBehavior:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatMode(I)V
a=0;// 
a=0;//     .line 851
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 852
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mDuration:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 853
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 854
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartTime(J)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method stopAnimation()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 863
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 864
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .line 865
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v0, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 866
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V
a=0;// 
a=0;//     .line 867
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     .line 869
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->postInvalidate()V
a=0;// 
a=0;//     .line 870
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 583
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
