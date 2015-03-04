package android.support.v4.view; class ViewPager { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewPager;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/ViewPager$ViewPositionComparator;,
a=0;//         Landroid/support/v4/view/ViewPager$LayoutParams;,
a=0;//         Landroid/support/v4/view/ViewPager$PagerObserver;,
a=0;//         Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;,
a=0;//         Landroid/support/v4/view/ViewPager$SavedState;,
a=0;//         Landroid/support/v4/view/ViewPager$Decor;,
a=0;//         Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$PageTransformer;,
a=0;//         Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$OnPageChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CLOSE_ENOUGH:I = 0x2
a=0;// 
a=0;// .field private static final COMPARATOR:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/ViewPager$ItemInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final DEFAULT_GUTTER_SIZE:I = 0x10
a=0;// 
a=0;// .field private static final DEFAULT_OFFSCREEN_PAGES:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_DEFAULT:I = 0x0
a=0;// 
a=0;// .field private static final DRAW_ORDER_FORWARD:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_REVERSE:I = 0x2
a=0;// 
a=0;// .field private static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field private static final MAX_SETTLE_DURATION:I = 0x258
a=0;// 
a=0;// .field private static final MIN_DISTANCE_FOR_FLING:I = 0x19
a=0;// 
a=0;// .field public static final SCROLL_STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final SCROLL_STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final SCROLL_STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ViewPager"
a=0;// 
a=0;// .field private static final USE_CACHE:Z
a=0;// 
a=0;// .field private static final sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private static final sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;// .field private mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;// .field private mBottomPageBounds:I
a=0;// 
a=0;// .field private mCalledSuper:Z
a=0;// 
a=0;// .field private mChildHeightMeasureSpec:I
a=0;// 
a=0;// .field private mChildWidthMeasureSpec:I
a=0;// 
a=0;// .field private mCloseEnough:I
a=0;// 
a=0;// .field private mCurItem:I
a=0;// 
a=0;// .field private mDecorChildCount:I
a=0;// 
a=0;// .field private mDefaultGutterSize:I
a=0;// 
a=0;// .field private mDrawingOrder:I
a=0;// 
a=0;// .field private mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mFakeDragBeginTime:J
a=0;// 
a=0;// .field private mFakeDragging:Z
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mFirstOffset:F
a=0;// 
a=0;// .field private mFlingDistance:I
a=0;// 
a=0;// .field private mGutterSize:I
a=0;// 
a=0;// .field private mIgnoreGutter:Z
a=0;// 
a=0;// .field private mInLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private final mItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/ViewPager$ItemInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mLastMotionX:F
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field private mLastOffset:F
a=0;// 
a=0;// .field private mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mMaximumVelocity:I
a=0;// 
a=0;// .field private mMinimumVelocity:I
a=0;// 
a=0;// .field private mNeedCalculatePageOffsets:Z
a=0;// 
a=0;// .field private mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;// .field private mOffscreenPageLimit:I
a=0;// 
a=0;// .field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mPageMargin:I
a=0;// 
a=0;// .field private mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// .field private mPopulatePending:Z
a=0;// 
a=0;// .field private mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field private mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;// .field private mRestoredCurItem:I
a=0;// 
a=0;// .field private mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mScrollState:I
a=0;// 
a=0;// .field private mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private mScrollingCacheEnabled:Z
a=0;// 
a=0;// .field private mSeenPositionMax:I
a=0;// 
a=0;// .field private mSeenPositionMin:I
a=0;// 
a=0;// .field private mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private final mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;// .field private final mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private mTopPageBounds:I
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x10100b3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$1;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$2;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$2;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$2;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 129
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 130
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 131
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 143
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 144
a=0;//     const v0, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 153
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 171
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 200
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 201
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 241
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 338
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 339
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 342
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 129
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 130
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 131
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 143
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 144
a=0;//     const v0, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 153
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 171
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 200
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 201
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 241
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 343
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 344
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/view/ViewPager;I)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/view/ViewPager;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400()[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;//     .locals 14
a=0;//     .param p1, "curItem"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .param p2, "curIndex"    # I
a=0;//     .param p3, "oldCurInfo"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1061
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1062
a=0;//     .local v1, "N":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1063
a=0;//     .local v11, "width":I
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_0
a=0;// 
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-float v12, v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     int-to-float v13, v11
a=0;// 
a=0;//     #v13=(Float);
a=0;//     div-float v6, v12, v13
a=0;// 
a=0;//     .line 1065
a=0;//     .local v6, "marginOffset":F
a=0;//     :goto_0
a=0;//     #v6=(Float);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz p3, :cond_6
a=0;// 
a=0;//     .line 1066
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v8, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1068
a=0;//     .local v8, "oldCurPosition":I
a=0;//     #v8=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v8, v12, :cond_3
a=0;// 
a=0;//     .line 1069
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1070
a=0;//     .local v5, "itemIndex":I
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1071
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float v7, v12, v6
a=0;// 
a=0;//     .line 1072
a=0;//     .local v7, "offset":F
a=0;//     #v7=(Float);
a=0;//     add-int/lit8 v9, v8, 0x1
a=0;// 
a=0;//     .line 1073
a=0;//     .local v9, "pos":I
a=0;//     :goto_1
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-gt v9, v12, :cond_6
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v5, v12, :cond_6
a=0;// 
a=0;//     .line 1074
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1075
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_2
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-le v9, v12, :cond_1
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     if-ge v5, v12, :cond_1
a=0;// 
a=0;//     .line 1076
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 1077
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1063
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v6    # "marginOffset":F
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v8    # "oldCurPosition":I
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1079
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     .restart local v6    # "marginOffset":F
a=0;//     .restart local v7    # "offset":F
a=0;//     .restart local v8    # "oldCurPosition":I
a=0;//     .restart local v9    # "pos":I
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v6=(Float);v7=(Float);v8=(Integer);v9=(Integer);v12=(Integer);v13=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ge v9, v12, :cond_2
a=0;// 
a=0;//     .line 1082
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1083
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1085
a=0;//     :cond_2
a=0;//     #v12=(Integer);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1086
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1073
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1088
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);v12=(Integer);v13=(Conflicted);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v8, v12, :cond_6
a=0;// 
a=0;//     .line 1089
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v5, v12, -0x1
a=0;// 
a=0;//     .line 1090
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1091
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1092
a=0;//     .restart local v7    # "offset":F
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v9, v8, -0x1
a=0;// 
a=0;//     .line 1093
a=0;//     .restart local v9    # "pos":I
a=0;//     :goto_4
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-lt v9, v12, :cond_6
a=0;// 
a=0;//     if-ltz v5, :cond_6
a=0;// 
a=0;//     .line 1094
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1095
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_5
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v9, v12, :cond_4
a=0;// 
a=0;//     if-lez v5, :cond_4
a=0;// 
a=0;//     .line 1096
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1097
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1099
a=0;//     :cond_4
a=0;//     :goto_6
a=0;//     #v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v9, v12, :cond_5
a=0;// 
a=0;//     .line 1102
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1103
a=0;//     #v7=(Float);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1105
a=0;//     :cond_5
a=0;//     #v7=(Integer);v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1106
a=0;//     #v7=(Float);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1093
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1112
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v8    # "oldCurPosition":I
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1113
a=0;//     .local v4, "itemCount":I
a=0;//     #v4=(Integer);
a=0;//     iget v7, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1114
a=0;//     .restart local v7    # "offset":F
a=0;//     #v7=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v9, v12, -0x1
a=0;// 
a=0;//     .line 1115
a=0;//     .restart local v9    # "pos":I
a=0;//     #v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-nez v12, :cond_7
a=0;// 
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     :goto_7
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1116
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v13, v1, -0x1
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ne v12, v13, :cond_8
a=0;// 
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     const/high16 v13, 0x3f800000    # 1.0f
a=0;// 
a=0;//     sub-float/2addr v12, v13
a=0;// 
a=0;//     :goto_8
a=0;//     #v12=(Integer);
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1119
a=0;//     add-int/lit8 v2, p2, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_9
a=0;//     #v2=(Integer);v10=(Conflicted);
a=0;//     if-ltz v2, :cond_b
a=0;// 
a=0;//     .line 1120
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1121
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_a
a=0;//     #v12=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-le v9, v12, :cond_9
a=0;// 
a=0;//     .line 1122
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v10, v9, -0x1
a=0;// 
a=0;//     .end local v9    # "pos":I
a=0;//     .local v10, "pos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     #v7=(Float);
a=0;//     move v9, v10
a=0;// 
a=0;//     .end local v10    # "pos":I
a=0;//     .restart local v9    # "pos":I
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 1115
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_7
a=0;//     #v2=(Uninit);v3=(Conflicted);v7=(Integer);v10=(Uninit);v12=(Integer);v13=(Conflicted);
a=0;//     const v12, -0x800001
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 1116
a=0;//     :cond_8
a=0;//     #v13=(Integer);
a=0;//     const v12, 0x7f7fffff    # Float.MAX_VALUE
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 1124
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_9
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v10=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1125
a=0;//     #v7=(Float);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1126
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-nez v12, :cond_a
a=0;// 
a=0;//     iput v7, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1119
a=0;//     :cond_a
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 1128
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);v7=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float v7, v12, v6
a=0;// 
a=0;//     .line 1129
a=0;//     #v7=(Float);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v9, v12, 0x1
a=0;// 
a=0;//     .line 1131
a=0;//     add-int/lit8 v2, p2, 0x1
a=0;// 
a=0;//     :goto_b
a=0;//     if-ge v2, v4, :cond_e
a=0;// 
a=0;//     .line 1132
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1133
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_c
a=0;//     #v12=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v9, v12, :cond_c
a=0;// 
a=0;//     .line 1134
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v10, v9, 0x1
a=0;// 
a=0;//     .end local v9    # "pos":I
a=0;//     .restart local v10    # "pos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     move v9, v10
a=0;// 
a=0;//     .end local v10    # "pos":I
a=0;//     .restart local v9    # "pos":I
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 1136
a=0;//     :cond_c
a=0;//     #v10=(Conflicted);v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v13, v1, -0x1
a=0;// 
a=0;//     if-ne v12, v13, :cond_d
a=0;// 
a=0;//     .line 1137
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v7
a=0;// 
a=0;//     #v12=(Float);
a=0;//     const/high16 v13, 0x3f800000    # 1.0f
a=0;// 
a=0;//     sub-float/2addr v12, v13
a=0;// 
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1139
a=0;//     :cond_d
a=0;//     #v12=(Integer);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1140
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1131
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 1143
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_e
a=0;//     #v3=(Conflicted);v12=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     iput-boolean v12, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 1144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private completeScroll(Z)V
a=0;//     .locals 10
a=0;//     .param p1, "postEvents"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1670
a=0;//     #v7=(Null);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v8, v9, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1671
a=0;//     .local v2, "needPopulate":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1673
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1674
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1675
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1676
a=0;//     .local v3, "oldX":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1677
a=0;//     .local v4, "oldY":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1678
a=0;//     .local v5, "x":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1679
a=0;//     .local v6, "y":I
a=0;//     #v6=(Integer);
a=0;//     if-ne v3, v5, :cond_0
a=0;// 
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     .line 1680
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v5, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1683
a=0;//     .end local v3    # "oldX":I
a=0;//     .end local v4    # "oldY":I
a=0;//     .end local v5    # "x":I
a=0;//     .end local v6    # "y":I
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1684
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v0, v8, :cond_4
a=0;// 
a=0;//     .line 1685
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1686
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-boolean v8, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 1687
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1688
a=0;//     #v2=(One);
a=0;//     iput-boolean v7, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     .line 1684
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v2    # "needPopulate":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Integer);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 1670
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1691
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "needPopulate":Z
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 1692
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 1693
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-static {p0, v7}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1698
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 1695
a=0;//     :cond_6
a=0;//     #v7=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v7}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private determineTargetPage(IFII)I
a=0;//     .locals 6
a=0;//     .param p1, "currentPage"    # I
a=0;//     .param p2, "pageOffset"    # F
a=0;//     .param p3, "velocity"    # I
a=0;//     .param p4, "deltaX"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 2070
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v3, v4, :cond_2
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     if-le v3, v4, :cond_2
a=0;// 
a=0;//     .line 2071
a=0;//     if-lez p3, :cond_1
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     .line 2081
a=0;//     .local v2, "targetPage":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 2082
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2083
a=0;//     .local v0, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2086
a=0;//     .local v1, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v3, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2089
a=0;//     .end local v0    # "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v1    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2071
a=0;//     .end local v2    # "targetPage":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     add-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2072
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     if-ltz v3, :cond_3
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     if-ge v3, p1, :cond_3
a=0;// 
a=0;//     cmpg-float v3, p2, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 2073
a=0;//     add-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     .restart local v2    # "targetPage":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2074
a=0;//     .end local v2    # "targetPage":I
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v3=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     add-int/lit8 v4, p1, 0x1
a=0;// 
a=0;//     if-le v3, v4, :cond_4
a=0;// 
a=0;//     cmpl-float v3, p2, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     .line 2076
a=0;//     add-int/lit8 v2, p1, -0x1
a=0;// 
a=0;//     .restart local v2    # "targetPage":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2078
a=0;//     .end local v2    # "targetPage":I
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v3=(Integer);
a=0;//     int-to-float v3, p1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, p2
a=0;// 
a=0;//     add-float/2addr v3, v5
a=0;// 
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .restart local v2    # "targetPage":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private enableLayers(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1705
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1706
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1707
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 1709
a=0;//     .local v2, "layerType":I
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v2, v4}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1706
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1707
a=0;//     .end local v2    # "layerType":I
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1711
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private endDrag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2322
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 2323
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 2325
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2326
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 2327
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2329
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;//     .locals 4
a=0;//     .param p1, "outRect"    # Landroid/graphics/Rect;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2464
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 2465
a=0;//     new-instance p1, Landroid/graphics/Rect;
a=0;// 
a=0;//     .end local p1    # "outRect":Landroid/graphics/Rect;
a=0;//     #p1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 2467
a=0;//     .restart local p1    # "outRect":Landroid/graphics/Rect;
a=0;//     :cond_0
a=0;//     #p1=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 2468
a=0;//     invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     .line 2486
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 2471
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2472
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2473
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2474
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2476
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2477
a=0;//     .local v1, "parent":Landroid/view/ViewParent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/ViewParent;);v3=(Conflicted);
a=0;//     instance-of v2, v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eq v1, p0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2478
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2479
a=0;//     .local v0, "group":Landroid/view/ViewGroup;
a=0;//     iget v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2480
a=0;//     iget v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2481
a=0;//     iget v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2482
a=0;//     iget v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2484
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2485
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 2027
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 2028
a=0;//     .local v12, "width":I
a=0;//     #v12=(Integer);
a=0;//     if-lez v12, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v11, v13, v14
a=0;// 
a=0;//     .line 2029
a=0;//     .local v11, "scrollOffset":F
a=0;//     :goto_0
a=0;//     #v11=(Float);v13=(Conflicted);v14=(Conflicted);
a=0;//     if-lez v12, :cond_0
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v8, v13, v14
a=0;// 
a=0;//     .line 2030
a=0;//     .local v8, "marginOffset":F
a=0;//     :cond_0
a=0;//     #v8=(Float);v13=(Conflicted);v14=(Conflicted);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 2031
a=0;//     .local v5, "lastPos":I
a=0;//     #v5=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 2032
a=0;//     .local v4, "lastOffset":F
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 2033
a=0;//     .local v6, "lastWidth":F
a=0;//     #v6=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2035
a=0;//     .local v0, "first":Z
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 2036
a=0;//     .local v3, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ge v1, v13, :cond_4
a=0;// 
a=0;//     .line 2037
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2039
a=0;//     .local v2, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v14, v5, 0x1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-eq v13, v14, :cond_1
a=0;// 
a=0;//     .line 2041
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2042
a=0;//     add-float v13, v4, v6
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v8
a=0;// 
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2043
a=0;//     add-int/lit8 v13, v5, 0x1
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2044
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v14, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2045
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 2047
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     iget v9, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2049
a=0;//     .local v9, "offset":F
a=0;//     #v9=(Integer);
a=0;//     move v7, v9
a=0;// 
a=0;//     .line 2050
a=0;//     .local v7, "leftBound":F
a=0;//     #v7=(Integer);
a=0;//     iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-float/2addr v13, v9
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float v10, v13, v8
a=0;// 
a=0;//     .line 2051
a=0;//     .local v10, "rightBound":F
a=0;//     #v10=(Float);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     cmpl-float v13, v11, v7
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-ltz v13, :cond_4
a=0;// 
a=0;//     .line 2052
a=0;//     :cond_2
a=0;//     #v13=(Float);
a=0;//     cmpg-float v13, v11, v10
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-ltz v13, :cond_3
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v13, v13, -0x1
a=0;// 
a=0;//     if-ne v1, v13, :cond_6
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 2065
a=0;//     .end local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v3    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v7    # "leftBound":F
a=0;//     .end local v9    # "offset":F
a=0;//     .end local v10    # "rightBound":F
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .end local v0    # "first":Z
a=0;//     .end local v1    # "i":I
a=0;//     .end local v4    # "lastOffset":F
a=0;//     .end local v5    # "lastPos":I
a=0;//     .end local v6    # "lastWidth":F
a=0;//     .end local v8    # "marginOffset":F
a=0;//     .end local v11    # "scrollOffset":F
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     move v11, v8
a=0;// 
a=0;//     .line 2028
a=0;//     #v11=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2058
a=0;//     .restart local v0    # "first":Z
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v3    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v4    # "lastOffset":F
a=0;//     .restart local v5    # "lastPos":I
a=0;//     .restart local v6    # "lastWidth":F
a=0;//     .restart local v7    # "leftBound":F
a=0;//     .restart local v8    # "marginOffset":F
a=0;//     .restart local v9    # "offset":F
a=0;//     .restart local v10    # "rightBound":F
a=0;//     .restart local v11    # "scrollOffset":F
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Float);v9=(Integer);v10=(Float);v11=(Float);v13=(Integer);v14=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2059
a=0;//     #v0=(Null);
a=0;//     iget v5, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2060
a=0;//     move v4, v9
a=0;// 
a=0;//     .line 2061
a=0;//     iget v6, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2062
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 2036
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private isGutterDrag(FF)Z
a=0;//     .locals 3
a=0;//     .param p1, "x"    # F
a=0;//     .param p2, "dx"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1701
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v2
a=0;// 
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     cmpg-float v0, p2, v2
a=0;// 
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;//     .locals 4
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2307
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2308
a=0;//     .local v2, "pointerIndex":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2309
a=0;//     .local v1, "pointerId":I
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 2312
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2313
a=0;//     .local v0, "newPointerIndex":I
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2314
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2315
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 2316
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     .line 2319
a=0;//     .end local v0    # "newPointerIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2312
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pageScrolled(I)Z
a=0;//     .locals 10
a=0;//     .param p1, "xpos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1558
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 1559
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1560
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, v7, v8, v7}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1561
a=0;//     iget-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 1562
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1567
a=0;//     :cond_0
a=0;//     #v7=(Null);v8=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1568
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1569
a=0;//     .local v5, "width":I
a=0;//     #v5=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     add-int v6, v5, v8
a=0;// 
a=0;//     .line 1570
a=0;//     .local v6, "widthWithMargin":I
a=0;//     #v6=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float v2, v8, v9
a=0;// 
a=0;//     .line 1571
a=0;//     .local v2, "marginOffset":F
a=0;//     #v2=(Float);
a=0;//     iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1572
a=0;//     .local v0, "currentPage":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v8, p1
a=0;// 
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     div-float/2addr v8, v9
a=0;// 
a=0;//     iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float/2addr v8, v9
a=0;// 
a=0;//     iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v9, v2
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float v4, v8, v9
a=0;// 
a=0;//     .line 1574
a=0;//     .local v4, "pageOffset":F
a=0;//     #v4=(Float);
a=0;//     int-to-float v8, v6
a=0;// 
a=0;//     mul-float/2addr v8, v4
a=0;// 
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     .line 1576
a=0;//     .local v3, "offsetPixels":I
a=0;//     #v3=(Integer);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1577
a=0;//     invoke-virtual {p0, v0, v4, v3}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1578
a=0;//     iget-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 1579
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1582
a=0;//     :cond_1
a=0;//     #v7=(Boolean);v8=(Float);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .end local v0    # "currentPage":I
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v2    # "marginOffset":F
a=0;//     .end local v3    # "offsetPixels":I
a=0;//     .end local v4    # "pageOffset":F
a=0;//     .end local v5    # "width":I
a=0;//     .end local v6    # "widthWithMargin":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     return v7
a=0;// .end method
a=0;// 
a=0;// .method private performDrag(F)Z
a=0;//     .locals 17
a=0;//     .param p1, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 1976
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1978
a=0;//     .local v7, "needsInvalidate":Z
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float v2, v14, p1
a=0;// 
a=0;//     .line 1979
a=0;//     .local v2, "deltaX":F
a=0;//     #v2=(Float);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1981
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     int-to-float v8, v14
a=0;// 
a=0;//     .line 1982
a=0;//     .local v8, "oldScrollX":F
a=0;//     #v8=(Float);
a=0;//     add-float v12, v8, v2
a=0;// 
a=0;//     .line 1983
a=0;//     .local v12, "scrollX":F
a=0;//     #v12=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1985
a=0;//     .local v13, "width":I
a=0;//     #v13=(Integer);
a=0;//     int-to-float v14, v13
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     mul-float v6, v14, v15
a=0;// 
a=0;//     .line 1986
a=0;//     .local v6, "leftBound":F
a=0;//     #v6=(Float);
a=0;//     int-to-float v14, v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v11, v14, v15
a=0;// 
a=0;//     .line 1987
a=0;//     .local v11, "rightBound":F
a=0;//     #v11=(Float);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 1988
a=0;//     .local v5, "leftAbsolute":Z
a=0;//     #v5=(One);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 1990
a=0;//     .local v10, "rightAbsolute":Z
a=0;//     #v10=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1991
a=0;//     .local v3, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1992
a=0;//     .local v4, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-eqz v14, :cond_0
a=0;// 
a=0;//     .line 1993
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1994
a=0;//     #v5=(Null);
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     int-to-float v15, v13
a=0;// 
a=0;//     #v15=(Float);
a=0;//     mul-float v6, v14, v15
a=0;// 
a=0;//     .line 1996
a=0;//     :cond_0
a=0;//     #v5=(Boolean);v15=(Integer);
a=0;//     iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v15}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     if-eq v14, v15, :cond_1
a=0;// 
a=0;//     .line 1997
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 1998
a=0;//     #v10=(Null);
a=0;//     iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     int-to-float v15, v13
a=0;// 
a=0;//     #v15=(Float);
a=0;//     mul-float v11, v14, v15
a=0;// 
a=0;//     .line 2001
a=0;//     :cond_1
a=0;//     #v10=(Boolean);v15=(Integer);
a=0;//     cmpg-float v14, v12, v6
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gez v14, :cond_4
a=0;// 
a=0;//     .line 2002
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 2003
a=0;//     sub-float v9, v6, v12
a=0;// 
a=0;//     .line 2004
a=0;//     .local v9, "over":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v14=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v15, v15, v16
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2006
a=0;//     .end local v9    # "over":F
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
a=0;//     move v12, v6
a=0;// 
a=0;//     .line 2015
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     float-to-int v15, v12
a=0;// 
a=0;//     int-to-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     sub-float v15, v12, v15
a=0;// 
a=0;//     add-float/2addr v14, v15
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2016
a=0;//     float-to-int v14, v12
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v14, v15}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2017
a=0;//     float-to-int v14, v12
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v14}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2019
a=0;//     return v7
a=0;// 
a=0;//     .line 2007
a=0;//     :cond_4
a=0;//     #v7=(Null);v9=(Uninit);v14=(Byte);v16=(Uninit);
a=0;//     cmpl-float v14, v12, v11
a=0;// 
a=0;//     if-lez v14, :cond_3
a=0;// 
a=0;//     .line 2008
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 2009
a=0;//     sub-float v9, v12, v11
a=0;// 
a=0;//     .line 2010
a=0;//     .restart local v9    # "over":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v14=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v15, v15, v16
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2012
a=0;//     .end local v9    # "over":F
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
a=0;//     move v12, v11
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private recomputeScrollPosition(IIII)V
a=0;//     .locals 14
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "oldWidth"    # I
a=0;//     .param p3, "margin"    # I
a=0;//     .param p4, "oldMargin"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1398
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1399
a=0;//     add-int v12, p1, p3
a=0;// 
a=0;//     .line 1400
a=0;//     .local v12, "widthWithMargin":I
a=0;//     #v12=(Integer);
a=0;//     add-int v7, p2, p4
a=0;// 
a=0;//     .line 1401
a=0;//     .local v7, "oldWidthWithMargin":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1402
a=0;//     .local v13, "xpos":I
a=0;//     #v13=(Integer);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v2, v7
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v8, v0, v2
a=0;// 
a=0;//     .line 1403
a=0;//     .local v8, "pageOffset":F
a=0;//     #v8=(Float);
a=0;//     int-to-float v0, v12
a=0;// 
a=0;//     mul-float/2addr v0, v8
a=0;// 
a=0;//     float-to-int v1, v0
a=0;// 
a=0;//     .line 1405
a=0;//     .local v1, "newOffsetPixels":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1406
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1408
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->timePassed()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v5, v0, v2
a=0;// 
a=0;//     .line 1409
a=0;//     .local v5, "newDuration":I
a=0;//     #v5=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1410
a=0;//     .local v11, "targetInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v11=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 1422
a=0;//     .end local v1    # "newOffsetPixels":I
a=0;//     .end local v5    # "newDuration":I
a=0;//     .end local v7    # "oldWidthWithMargin":I
a=0;//     .end local v8    # "pageOffset":F
a=0;//     .end local v11    # "targetInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v12    # "widthWithMargin":I
a=0;//     .end local v13    # "xpos":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1414
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1415
a=0;//     .local v6, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     iget v0, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1416
a=0;//     .local v9, "scrollOffset":F
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v9=(Float);
a=0;//     int-to-float v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v9
a=0;// 
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 1417
a=0;//     .local v10, "scrollPos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v10, v0, :cond_0
a=0;// 
a=0;//     .line 1418
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1419
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v10, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1415
a=0;//     .end local v9    # "scrollOffset":F
a=0;//     .end local v10    # "scrollPos":I
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private removeNonDecorViews()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 445
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 446
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 447
a=0;//     .local v2, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v3, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->removeViewAt(I)V
a=0;// 
a=0;//     .line 449
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 452
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v2    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private scrollToItem(IZIZ)V
a=0;//     .locals 8
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "velocity"    # I
a=0;//     .param p4, "dispatchSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 529
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 530
a=0;//     .local v0, "curInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 531
a=0;//     .local v1, "destX":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 532
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 533
a=0;//     .local v2, "width":I
a=0;//     #v2=(Integer);
a=0;//     int-to-float v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v1, v3
a=0;// 
a=0;//     .line 536
a=0;//     .end local v2    # "width":I
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 537
a=0;//     invoke-virtual {p0, v1, v7, p3}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 538
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 539
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 541
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 542
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 554
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 545
a=0;//     :cond_3
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 546
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 548
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p4, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 549
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 551
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 552
a=0;//     invoke-virtual {p0, v1, v7}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setScrollState(I)V
a=0;//     .locals 2
a=0;//     .param p1, "newState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 380
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 384
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 385
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 386
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     .line 388
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 390
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->enableLayers(Z)V
a=0;// 
a=0;//     .line 392
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 390
a=0;//     :cond_4
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private setScrollingCacheEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2332
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 2333
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     .line 2344
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addFocusables(Ljava/util/ArrayList;II)V
a=0;//     .locals 7
a=0;//     .param p2, "direction"    # I
a=0;//     .param p3, "focusableMode"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;II)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2510
a=0;//     .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2512
a=0;//     .local v2, "focusableCount":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDescendantFocusability()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2514
a=0;//     .local v1, "descendantFocusability":I
a=0;//     #v1=(Integer);
a=0;//     const/high16 v5, 0x60000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v1, v5, :cond_1
a=0;// 
a=0;//     .line 2515
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-ge v3, v5, :cond_1
a=0;// 
a=0;//     .line 2516
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2517
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 2518
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2519
a=0;//     .local v4, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget v5, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 2520
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
a=0;// 
a=0;//     .line 2515
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2530
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/high16 v5, 0x40000
a=0;// 
a=0;//     if-ne v1, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 2536
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusable()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 2547
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 2539
a=0;//     :cond_4
a=0;//     #v5=(Boolean);
a=0;//     and-int/lit8 v5, p3, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusableInTouchMode()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 2543
a=0;//     :cond_5
a=0;//     #v5=(Integer);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 2544
a=0;//     invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 799
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     .line 800
a=0;//     .local v0, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput p1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 801
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v1, p0, p1}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     .line 802
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 803
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p2, v1, :cond_1
a=0;// 
a=0;//     .line 804
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 808
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 806
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addTouchables(Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2557
a=0;//     .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 2558
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2559
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 2560
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 2561
a=0;//     .local v2, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v3, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 2562
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 2557
a=0;//     .end local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2566
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 3
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1231
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1232
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object p3
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, p3
a=0;// 
a=0;//     .line 1234
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1235
a=0;//     .local v0, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     instance-of v2, p1, Landroid/support/v4/view/ViewPager$Decor;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     .line 1236
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1237
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1238
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Cannot add pager decor view during layout"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1240
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Boolean);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1241
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     .line 1253
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 1243
a=0;//     :cond_2
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public arrowScroll(I)Z
a=0;//     .locals 8
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x42
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v6, 0x11
a=0;// 
a=0;//     .line 2421
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2422
a=0;//     .local v1, "currentFocused":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, p0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 2424
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2426
a=0;//     .local v2, "handled":Z
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/FocusFinder;);
a=0;//     invoke-virtual {v5, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2428
a=0;//     .local v3, "nextFocused":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     if-eq v3, v1, :cond_6
a=0;// 
a=0;//     .line 2429
a=0;//     if-ne p1, v6, :cond_4
a=0;// 
a=0;//     .line 2432
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v5, v3}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v4, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2433
a=0;//     .local v4, "nextLeft":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v5, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v0, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2434
a=0;//     .local v0, "currLeft":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-lt v4, v0, :cond_3
a=0;// 
a=0;//     .line 2435
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2457
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v4    # "nextLeft":I
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 2458
a=0;//     invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 2460
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2437
a=0;//     .restart local v0    # "currLeft":I
a=0;//     .restart local v4    # "nextLeft":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Null);v4=(Integer);v5=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2439
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v4    # "nextLeft":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     if-ne p1, v7, :cond_1
a=0;// 
a=0;//     .line 2442
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v5, v3}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v4, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2443
a=0;//     .restart local v4    # "nextLeft":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v5, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v0, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2444
a=0;//     .restart local v0    # "currLeft":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     if-gt v4, v0, :cond_5
a=0;// 
a=0;//     .line 2445
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2447
a=0;//     :cond_5
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2450
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v4    # "nextLeft":I
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     if-eq p1, v6, :cond_7
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne p1, v5, :cond_8
a=0;// 
a=0;//     .line 2452
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2453
a=0;//     :cond_8
a=0;//     #v2=(Null);v5=(One);
a=0;//     if-eq p1, v7, :cond_9
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne p1, v5, :cond_1
a=0;// 
a=0;//     .line 2455
a=0;//     :cond_9
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public beginFakeDrag()Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2196
a=0;//     #v5=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2212
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 2199
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2200
a=0;//     invoke-direct {p0, v9}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 2201
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     .line 2202
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 2203
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2207
a=0;//     :goto_1
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .local v0, "time":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v4
a=0;// 
a=0;//     .line 2208
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 2209
a=0;//     .local v8, "ev":Landroid/view/MotionEvent;
a=0;//     #v8=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2210
a=0;//     invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2211
a=0;//     iput-wide v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     move v4, v9
a=0;// 
a=0;//     .line 2212
a=0;//     #v4=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2205
a=0;//     .end local v0    # "time":J
a=0;//     .end local v8    # "ev":Landroid/view/MotionEvent;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "checkV"    # Z
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "x"    # I
a=0;//     .param p5, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2358
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 2359
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2360
a=0;//     .local v7, "group":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 2361
a=0;//     .local v9, "scrollX":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 2362
a=0;//     .local v10, "scrollY":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 2364
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v8, v6, -0x1
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     if-ltz v8, :cond_1
a=0;// 
a=0;//     .line 2367
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2368
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, v0, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move v3, p3
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2372
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2377
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2364
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .restart local v8    # "i":I
a=0;//     .restart local v9    # "scrollX":I
a=0;//     .restart local v10    # "scrollY":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/View;);v2=(Integer);v6=(Integer);v7=(Reference,Landroid/view/ViewGroup;);v8=(Integer);v9=(Integer);v10=(Integer);
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2377
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     neg-int v0, p3
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2635
a=0;//     instance-of v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1534
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1535
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1536
a=0;//     .local v0, "oldX":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1537
a=0;//     .local v1, "oldY":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1538
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1540
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     .line 1541
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1542
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1543
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1544
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v4, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1549
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1555
a=0;//     .end local v0    # "oldX":I
a=0;//     .end local v1    # "oldY":I
a=0;//     .end local v2    # "x":I
a=0;//     .end local v3    # "y":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1554
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dataSetChanged()V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 814
a=0;//     #v10=(Null);
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     mul-int/lit8 v12, v12, 0x2
a=0;// 
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     if-ge v11, v12, :cond_1
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v11, v12, :cond_1
a=0;// 
a=0;//     move v6, v9
a=0;// 
a=0;//     .line 816
a=0;//     .local v6, "needPopulate":Z
a=0;//     :goto_0
a=0;//     #v6=(Boolean);
a=0;//     iget v7, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 818
a=0;//     .local v7, "newCurrItem":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 819
a=0;//     .local v4, "isUpdating":Z
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Boolean);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-ge v2, v11, :cond_6
a=0;// 
a=0;//     .line 820
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 821
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v11, v12}, Landroid/support/v4/view/PagerAdapter;->getItemPosition(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 823
a=0;//     .local v8, "newPos":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-ne v8, v11, :cond_2
a=0;// 
a=0;//     .line 819
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v11=(Integer);v12=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v4    # "isUpdating":Z
a=0;//     .end local v6    # "needPopulate":Z
a=0;//     .end local v7    # "newCurrItem":I
a=0;//     .end local v8    # "newPos":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v12=(Integer);v13=(Uninit);
a=0;//     move v6, v10
a=0;// 
a=0;//     .line 814
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 827
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v4    # "isUpdating":Z
a=0;//     .restart local v6    # "needPopulate":Z
a=0;//     .restart local v7    # "newCurrItem":I
a=0;//     .restart local v8    # "newPos":I
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Boolean);v6=(Boolean);v7=(Integer);v8=(Integer);v11=(Byte);v12=(Reference,Ljava/lang/Object;);v13=(Conflicted);
a=0;//     const/4 v11, -0x2
a=0;// 
a=0;//     if-ne v8, v11, :cond_4
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 829
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     .line 831
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v11, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 833
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 836
a=0;//     :cond_3
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     iget-object v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v11, p0, v12, v13}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 837
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 839
a=0;//     #v6=(One);
a=0;//     iget v11, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ne v11, v12, :cond_0
a=0;// 
a=0;//     .line 841
a=0;//     iget v11, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 842
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 847
a=0;//     :cond_4
a=0;//     #v6=(Boolean);v11=(Byte);v12=(Reference,Ljava/lang/Object;);v13=(Conflicted);
a=0;//     iget v11, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-eq v11, v8, :cond_0
a=0;// 
a=0;//     .line 848
a=0;//     iget v11, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ne v11, v12, :cond_5
a=0;// 
a=0;//     .line 850
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 853
a=0;//     :cond_5
a=0;//     iput v8, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 854
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 858
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v8    # "newPos":I
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);v6=(Boolean);v8=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 859
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v11, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 862
a=0;//     :cond_7
a=0;//     #v11=(Conflicted);
a=0;//     iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v12, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-static {v11, v12}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 864
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     .line 866
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 867
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v5=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v2, v1, :cond_9
a=0;// 
a=0;//     .line 868
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 869
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v5, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 870
a=0;//     .local v5, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v11, v5, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_8
a=0;// 
a=0;//     .line 871
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     iput v11, v5, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 867
a=0;//     :cond_8
a=0;//     #v11=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 875
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v5    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v5=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {p0, v7, v10, v9}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 876
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 878
a=0;//     .end local v1    # "childCount":I
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2383
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2608
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2609
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 2610
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2611
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 2612
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2613
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget v4, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 2615
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 2620
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 2609
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);v4=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2620
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method distanceInfluenceForSnapDuration(F)F
a=0;//     .locals 4
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 735
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr p1, v0
a=0;// 
a=0;//     .line 736
a=0;//     float-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x3fde28c7460698c7L    # 0.4712389167638204
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-float p1, v0
a=0;// 
a=0;//     .line 737
a=0;//     float-to-double v0, p1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 2094
a=0;//     #v6=(One);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2095
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 2097
a=0;//     .local v1, "needsInvalidate":Z
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2098
a=0;//     .local v2, "overScrollMode":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-ne v2, v6, :cond_4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v5, v6, :cond_4
a=0;// 
a=0;//     .line 2101
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 2102
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2103
a=0;//     .local v3, "restoreCount":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     sub-int v0, v5, v6
a=0;// 
a=0;//     .line 2104
a=0;//     .local v0, "height":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2106
a=0;//     .local v4, "width":I
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x43870000    # 270.0f
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2107
a=0;//     neg-int v5, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2108
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2109
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 2110
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2112
a=0;//     .end local v0    # "height":I
a=0;//     .end local v3    # "restoreCount":I
a=0;//     .end local v4    # "width":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 2113
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2114
a=0;//     .restart local v3    # "restoreCount":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2115
a=0;//     .restart local v4    # "width":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     sub-int v0, v5, v6
a=0;// 
a=0;//     .line 2117
a=0;//     .restart local v0    # "height":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v5, 0x42b40000    # 90.0f
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2118
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     neg-float v6, v6
a=0;// 
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2119
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2120
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 2121
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2128
a=0;//     .end local v0    # "height":I
a=0;//     .end local v3    # "restoreCount":I
a=0;//     .end local v4    # "width":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 2130
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 2132
a=0;//     :cond_3
a=0;//     return-void
a=0;// 
a=0;//     .line 2124
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Null);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Uninit);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     .line 2125
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 723
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V
a=0;// 
a=0;//     .line 724
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 725
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 726
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 728
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endFakeDrag()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     .line 2222
a=0;//     #v11=(One);
a=0;//     iget-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 2223
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v10, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v9
a=0;// 
a=0;//     .line 2226
a=0;//     :cond_0
a=0;//     #v9=(Boolean);v10=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2227
a=0;//     .local v7, "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     #v7=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v9, 0x3e8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     iget v10, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     invoke-virtual {v7, v9, v10}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 2228
a=0;//     iget v9, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v7, v9}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     float-to-int v2, v9
a=0;// 
a=0;//     .line 2230
a=0;//     .local v2, "initialVelocity":I
a=0;//     #v2=(Integer);
a=0;//     iput-boolean v11, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 2231
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 2232
a=0;//     .local v8, "width":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 2233
a=0;//     .local v5, "scrollX":I
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2234
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2235
a=0;//     .local v0, "currentPage":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     int-to-float v10, v8
a=0;// 
a=0;//     div-float/2addr v9, v10
a=0;// 
a=0;//     iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     div-float v4, v9, v10
a=0;// 
a=0;//     .line 2236
a=0;//     .local v4, "pageOffset":F
a=0;//     #v4=(Float);
a=0;//     iget v9, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget v10, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     #v9=(Float);
a=0;//     float-to-int v6, v9
a=0;// 
a=0;//     .line 2237
a=0;//     .local v6, "totalDelta":I
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {p0, v0, v4, v2, v6}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2239
a=0;//     .local v3, "nextPage":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3, v11, v11, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 2240
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2242
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2243
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 2395
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2396
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 2397
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 2417
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2399
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2400
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2402
a=0;//     :sswitch_1
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     const/16 v1, 0x42
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2403
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2405
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 2408
a=0;//     invoke-static {p1}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 2409
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2410
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/KeyEventCompat;->hasModifiers(Landroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2411
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2397
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x15 -> :sswitch_0
a=0;//         0x16 -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public fakeDragBy(F)V
a=0;//     .locals 17
a=0;//     .param p1, "xOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 2253
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 2254
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 2257
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float v1, v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2259
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v13, v1
a=0;// 
a=0;//     .line 2260
a=0;//     .local v13, "oldScrollX":F
a=0;//     #v13=(Float);
a=0;//     sub-float v15, v13, p1
a=0;// 
a=0;//     .line 2261
a=0;//     .local v15, "scrollX":F
a=0;//     #v15=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 2263
a=0;//     .local v16, "width":I
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float v12, v1, v2
a=0;// 
a=0;//     .line 2264
a=0;//     .local v12, "leftBound":F
a=0;//     #v12=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v14, v1, v2
a=0;// 
a=0;//     .line 2266
a=0;//     .local v14, "rightBound":F
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2267
a=0;//     .local v10, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2268
a=0;//     .local v11, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 2269
a=0;//     iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float v12, v1, v2
a=0;// 
a=0;//     .line 2271
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-eq v1, v2, :cond_2
a=0;// 
a=0;//     .line 2272
a=0;//     iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float v14, v1, v2
a=0;// 
a=0;//     .line 2275
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     cmpg-float v1, v15, v12
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_4
a=0;// 
a=0;//     .line 2276
a=0;//     move v15, v12
a=0;// 
a=0;//     .line 2281
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v15
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v2, v15, v2
a=0;// 
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2282
a=0;//     float-to-int v1, v15
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2283
a=0;//     float-to-int v1, v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2286
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 2287
a=0;//     .local v3, "time":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 2289
a=0;//     .local v9, "ev":Landroid/view/MotionEvent;
a=0;//     #v9=(Reference,Landroid/view/MotionEvent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v1, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2290
a=0;//     invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2291
a=0;//     return-void
a=0;// 
a=0;//     .line 2277
a=0;//     .end local v3    # "time":J
a=0;//     .end local v9    # "ev":Landroid/view/MotionEvent;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Byte);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     cmpl-float v1, v15, v14
a=0;// 
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 2278
a=0;//     move v15, v14
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2625
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2640
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2630
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getChildDrawingOrder(II)I
a=0;//     .locals 4
a=0;//     .param p1, "childCount"    # I
a=0;//     .param p2, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     add-int/lit8 v2, p1, -0x1
a=0;// 
a=0;//     sub-int v0, v2, p2
a=0;// 
a=0;//     .line 612
a=0;//     .local v0, "index":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     iget v1, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 613
a=0;//     .local v1, "result":I
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .end local v0    # "index":I
a=0;//     .end local v1    # "result":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);
a=0;//     move v0, p2
a=0;// 
a=0;//     .line 611
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOffscreenPageLimit()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 636
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPageMargin()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1267
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "parent":Landroid/view/ViewParent;
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eq v0, p0, :cond_2
a=0;// 
a=0;//     .line 1268
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Landroid/view/View;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1269
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1273
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 1271
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 4
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1256
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 1257
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1258
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/support/v4/view/PagerAdapter;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1262
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1256
a=0;//     .restart local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1262
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1277
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 1278
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1279
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v2, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_0
a=0;// 
a=0;//     .line 1283
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1277
a=0;//     .restart local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1283
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method initViewPager()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 347
a=0;//     #v5=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 348
a=0;//     const/high16 v3, 0x40000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 349
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 351
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/Scroller;);
a=0;//     sget-object v4, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-direct {v3, v1, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 352
a=0;//     invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 353
a=0;//     .local v0, "configuration":Landroid/view/ViewConfiguration;
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     .line 356
a=0;//     new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 357
a=0;//     new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 359
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v2, v3, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 360
a=0;//     .local v2, "density":F
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     .line 361
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     .line 362
a=0;//     const/high16 v3, 0x41800000    # 16.0f
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     .line 364
a=0;//     new-instance v3, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-direct {v3, p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 366
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     invoke-static {p0, v5}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 371
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isFakeDragging()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2303
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1288
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 1289
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1290
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 376
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 18
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2136
a=0;//     invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2139
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lez v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lez v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 2140
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 2141
a=0;//     .local v10, "scrollX":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 2143
a=0;//     .local v11, "width":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v7, v13, v14
a=0;// 
a=0;//     .line 2144
a=0;//     .local v7, "marginOffset":F
a=0;//     #v7=(Float);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2145
a=0;//     .local v5, "itemIndex":I
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2146
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v8, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2147
a=0;//     .local v8, "offset":F
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2148
a=0;//     .local v4, "itemCount":I
a=0;//     #v4=(Integer);
a=0;//     iget v2, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2149
a=0;//     .local v2, "firstPos":I
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     add-int/lit8 v14, v4, -0x1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iget v6, v13, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2150
a=0;//     .local v6, "lastPos":I
a=0;//     #v6=(Integer);
a=0;//     move v9, v2
a=0;// 
a=0;//     .local v9, "pos":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Integer);v9=(Integer);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     if-ge v9, v6, :cond_2
a=0;// 
a=0;//     .line 2151
a=0;//     :goto_1
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-le v9, v13, :cond_0
a=0;// 
a=0;//     if-ge v5, v4, :cond_0
a=0;// 
a=0;//     .line 2152
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2156
a=0;//     :cond_0
a=0;//     #v13=(Integer);
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ne v9, v13, :cond_3
a=0;// 
a=0;//     .line 2157
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float v1, v13, v14
a=0;// 
a=0;//     .line 2158
a=0;//     .local v1, "drawAt":F
a=0;//     #v1=(Float);
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float v8, v13, v7
a=0;// 
a=0;//     .line 2165
a=0;//     :goto_2
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v1
a=0;// 
a=0;//     int-to-float v14, v10
a=0;// 
a=0;//     #v14=(Float);
a=0;//     cmpl-float v13, v13, v14
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-lez v13, :cond_1
a=0;// 
a=0;//     .line 2166
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     float-to-int v14, v1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     add-float v16, v16, v1
a=0;// 
a=0;//     const/high16 v17, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-float v16, v16, v17
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v13 .. v17}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 2168
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2171
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     add-int v13, v10, v11
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     cmpl-float v13, v1, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-lez v13, :cond_4
a=0;// 
a=0;//     .line 2176
a=0;//     .end local v1    # "drawAt":F
a=0;//     .end local v2    # "firstPos":I
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v4    # "itemCount":I
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v6    # "lastPos":I
a=0;//     .end local v7    # "marginOffset":F
a=0;//     .end local v8    # "offset":F
a=0;//     .end local v9    # "pos":I
a=0;//     .end local v10    # "scrollX":I
a=0;//     .end local v11    # "width":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2160
a=0;//     .restart local v2    # "firstPos":I
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v4    # "itemCount":I
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     .restart local v6    # "lastPos":I
a=0;//     .restart local v7    # "marginOffset":F
a=0;//     .restart local v8    # "offset":F
a=0;//     .restart local v9    # "pos":I
a=0;//     .restart local v10    # "scrollX":I
a=0;//     .restart local v11    # "width":I
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Float);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Integer);v13=(Integer);v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v13, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 2161
a=0;//     .local v12, "widthFactor":F
a=0;//     #v12=(Float);
a=0;//     add-float v13, v8, v12
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float v1, v13, v14
a=0;// 
a=0;//     .line 2162
a=0;//     .restart local v1    # "drawAt":F
a=0;//     #v1=(Float);
a=0;//     add-float v13, v12, v7
a=0;// 
a=0;//     add-float/2addr v8, v13
a=0;// 
a=0;//     #v8=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2150
a=0;//     .end local v12    # "widthFactor":F
a=0;//     :cond_4
a=0;//     #v12=(Conflicted);v13=(Byte);v14=(Integer);
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 14
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1721
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v6, v0, 0xff
a=0;// 
a=0;//     .line 1724
a=0;//     .local v6, "action":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v6, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v6, v0, :cond_2
a=0;// 
a=0;//     .line 1727
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1728
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1729
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1730
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1731
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 1732
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1734
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1853
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1739
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 1740
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1742
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1744
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1746
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1750
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     .line 1844
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 1845
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1847
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1853
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1761
a=0;//     :sswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget v7, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1762
a=0;//     .local v7, "activePointerId":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v7, v0, :cond_5
a=0;// 
a=0;//     .line 1767
a=0;//     invoke-static {p1, v7}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1768
a=0;//     .local v9, "pointerIndex":I
a=0;//     #v9=(Integer);
a=0;//     invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1769
a=0;//     .local v10, "x":F
a=0;//     #v10=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v8, v10, v0
a=0;// 
a=0;//     .line 1770
a=0;//     .local v8, "dx":F
a=0;//     #v8=(Float);
a=0;//     invoke-static {v8}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1771
a=0;//     .local v11, "xDiff":F
a=0;//     #v11=(Float);
a=0;//     invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1772
a=0;//     .local v12, "y":F
a=0;//     #v12=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     sub-float v0, v12, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1775
a=0;//     .local v13, "yDiff":F
a=0;//     #v13=(Float);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpl-float v0, v8, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v8}, Landroid/support/v4/view/ViewPager;->isGutterDrag(FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v10
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-int v5, v12
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 1778
a=0;//     iput v10, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     iput v10, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     .line 1779
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1780
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1781
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1783
a=0;//     :cond_7
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v11, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     cmpl-float v0, v11, v13
a=0;// 
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     .line 1785
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1786
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1787
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpl-float v0, v8, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1789
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1800
a=0;//     :cond_8
a=0;//     :goto_3
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1802
a=0;//     invoke-direct {p0, v10}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1803
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1787
a=0;//     :cond_9
a=0;//     #v0=(Byte);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1791
a=0;//     :cond_a
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v13, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     .line 1797
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1814
a=0;//     .end local v7    # "activePointerId":I
a=0;//     .end local v8    # "dx":F
a=0;//     .end local v9    # "pointerIndex":I
a=0;//     .end local v10    # "x":F
a=0;//     .end local v11    # "xDiff":F
a=0;//     .end local v12    # "y":F
a=0;//     .end local v13    # "yDiff":F
a=0;//     :sswitch_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1815
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1816
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1817
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1819
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     .line 1820
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     if-le v0, v1, :cond_b
a=0;// 
a=0;//     .line 1823
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1824
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1825
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1826
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1827
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1829
a=0;//     :cond_b
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1830
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1840
a=0;//     :sswitch_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1750
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x2 -> :sswitch_0
a=0;//         0x6 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 24
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1426
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1427
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1428
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1430
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1431
a=0;//     .local v5, "count":I
a=0;//     #v5=(Integer);
a=0;//     sub-int v20, p4, p2
a=0;// 
a=0;//     .line 1432
a=0;//     .local v20, "width":I
a=0;//     #v20=(Integer);
a=0;//     sub-int v7, p5, p3
a=0;// 
a=0;//     .line 1433
a=0;//     .local v7, "height":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1434
a=0;//     .local v15, "paddingLeft":I
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1435
a=0;//     .local v17, "paddingTop":I
a=0;//     #v17=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1436
a=0;//     .local v16, "paddingRight":I
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1437
a=0;//     .local v14, "paddingBottom":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1439
a=0;//     .local v18, "scrollX":I
a=0;//     #v18=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1443
a=0;//     .local v6, "decorCount":I
a=0;//     #v6=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);v9=(Conflicted);v10=(Integer);v13=(Conflicted);v19=(Conflicted);v22=(Integer);v23=(Conflicted);
a=0;//     if-ge v10, v5, :cond_1
a=0;// 
a=0;//     .line 1444
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1445
a=0;//     .local v2, "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     const/16 v23, 0x8
a=0;// 
a=0;//     #v23=(PosByte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1446
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1447
a=0;//     .local v13, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1448
a=0;//     .local v3, "childLeft":I
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1449
a=0;//     .local v4, "childTop":I
a=0;//     #v4=(Null);
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_0
a=0;// 
a=0;//     .line 1450
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     and-int/lit8 v9, v22, 0x7
a=0;// 
a=0;//     .line 1451
a=0;//     .local v9, "hgrav":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     and-int/lit8 v19, v22, 0x70
a=0;// 
a=0;//     .line 1452
a=0;//     .local v19, "vgrav":I
a=0;//     #v19=(Integer);
a=0;//     packed-switch v9, :pswitch_data_0
a=0;// 
a=0;//     .line 1454
a=0;//     :pswitch_0
a=0;//     move v3, v15
a=0;// 
a=0;//     .line 1469
a=0;//     :goto_1
a=0;//     #v3=(Integer);v23=(Integer);
a=0;//     sparse-switch v19, :sswitch_data_0
a=0;// 
a=0;//     .line 1471
a=0;//     move/from16 v4, v17
a=0;// 
a=0;//     .line 1486
a=0;//     :goto_2
a=0;//     #v1=(Integer);v4=(Integer);
a=0;//     add-int v3, v3, v18
a=0;// 
a=0;//     .line 1487
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v22, v22, v3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     add-int v23, v23, v4
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4, v0, v1}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1490
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 1443
a=0;//     .end local v3    # "childLeft":I
a=0;//     .end local v4    # "childTop":I
a=0;//     .end local v9    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v19    # "vgrav":I
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v13=(Conflicted);v19=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1457
a=0;//     .restart local v3    # "childLeft":I
a=0;//     .restart local v4    # "childTop":I
a=0;//     .restart local v9    # "hgrav":I
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .restart local v19    # "vgrav":I
a=0;//     :pswitch_1
a=0;//     #v1=(PosByte);v3=(Null);v4=(Null);v9=(Integer);v13=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v19=(Integer);v23=(PosByte);
a=0;//     move v3, v15
a=0;// 
a=0;//     .line 1458
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v15, v15, v22
a=0;// 
a=0;//     .line 1459
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1461
a=0;//     :pswitch_2
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v22, v20, v22
a=0;// 
a=0;//     div-int/lit8 v22, v22, 0x2
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1463
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1465
a=0;//     :pswitch_3
a=0;//     #v3=(Null);
a=0;//     sub-int v22, v20, v16
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     sub-int v3, v22, v23
a=0;// 
a=0;//     .line 1466
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v16, v16, v22
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1474
a=0;//     :sswitch_0
a=0;//     move/from16 v4, v17
a=0;// 
a=0;//     .line 1475
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v17, v17, v22
a=0;// 
a=0;//     .line 1476
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1478
a=0;//     :sswitch_1
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v22, v7, v22
a=0;// 
a=0;//     div-int/lit8 v22, v22, 0x2
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1480
a=0;//     #v4=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1482
a=0;//     :sswitch_2
a=0;//     #v1=(PosByte);v4=(Null);
a=0;//     sub-int v22, v7, v14
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     sub-int v4, v22, v23
a=0;// 
a=0;//     .line 1483
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v14, v14, v22
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1496
a=0;//     .end local v2    # "child":Landroid/view/View;
a=0;//     .end local v3    # "childLeft":I
a=0;//     .end local v4    # "childTop":I
a=0;//     .end local v9    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v19    # "vgrav":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v13=(Conflicted);v19=(Conflicted);v23=(Conflicted);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v21=(Conflicted);
a=0;//     if-ge v10, v5, :cond_4
a=0;// 
a=0;//     .line 1497
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1498
a=0;//     .restart local v2    # "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     const/16 v23, 0x8
a=0;// 
a=0;//     #v23=(PosByte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1499
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1501
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-nez v22, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .local v11, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v11=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     .line 1502
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Float);
a=0;//     iget v0, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     mul-float v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v12, v0
a=0;// 
a=0;//     .line 1503
a=0;//     .local v12, "loff":I
a=0;//     #v12=(Integer);
a=0;//     add-int v3, v15, v12
a=0;// 
a=0;//     .line 1504
a=0;//     .restart local v3    # "childLeft":I
a=0;//     #v3=(Integer);
a=0;//     move/from16 v4, v17
a=0;// 
a=0;//     .line 1505
a=0;//     .restart local v4    # "childTop":I
a=0;//     #v4=(Integer);
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_2
a=0;// 
a=0;//     .line 1508
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1509
a=0;//     sub-int v22, v20, v15
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     sub-int v22, v22, v16
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Float);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     mul-float v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     const/high16 v23, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static/range {v22 .. v23}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 1512
a=0;//     .local v21, "widthSpec":I
a=0;//     #v21=(Integer);
a=0;//     sub-int v22, v7, v17
a=0;// 
a=0;//     sub-int v22, v22, v14
a=0;// 
a=0;//     const/high16 v23, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static/range {v22 .. v23}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1515
a=0;//     .local v8, "heightSpec":I
a=0;//     #v8=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v2, v0, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1520
a=0;//     .end local v8    # "heightSpec":I
a=0;//     .end local v21    # "widthSpec":I
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);v21=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     add-int v22, v22, v3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     add-int v23, v23, v4
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v0, v1}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1496
a=0;//     .end local v3    # "childLeft":I
a=0;//     .end local v4    # "childTop":I
a=0;//     .end local v11    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v12    # "loff":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1526
a=0;//     .end local v2    # "child":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v23=(Conflicted);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     .line 1527
a=0;//     sub-int v22, v7, v14
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     .line 1528
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v6, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     .line 1529
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1530
a=0;//     return-void
a=0;// 
a=0;//     .line 1452
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1469
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x30 -> :sswitch_0
a=0;//         0x50 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 23
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1299
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     move/from16 v2, v22
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 1302
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1303
a=0;//     .local v15, "measuredWidth":I
a=0;//     #v15=(Integer);
a=0;//     div-int/lit8 v14, v15, 0xa
a=0;// 
a=0;//     .line 1304
a=0;//     .local v14, "maxGutterSize":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     .line 1307
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v21, v15, v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v5, v21, v22
a=0;// 
a=0;//     .line 1308
a=0;//     .local v5, "childWidthSize":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v21, v21, v22
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v4, v21, v22
a=0;// 
a=0;//     .line 1315
a=0;//     .local v4, "childHeightSize":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1316
a=0;//     .local v16, "size":I
a=0;//     #v16=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Integer);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v12, v0, :cond_a
a=0;// 
a=0;//     .line 1317
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1318
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     const/16 v22, 0x8
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     .line 1319
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1320
a=0;//     .local v13, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     if-eqz v13, :cond_5
a=0;// 
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-eqz v21, :cond_5
a=0;// 
a=0;//     .line 1321
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     and-int/lit8 v11, v21, 0x7
a=0;// 
a=0;//     .line 1322
a=0;//     .local v11, "hgrav":I
a=0;//     #v11=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     and-int/lit8 v17, v21, 0x70
a=0;// 
a=0;//     .line 1323
a=0;//     .local v17, "vgrav":I
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, -0x80000000
a=0;// 
a=0;//     .line 1324
a=0;//     .local v18, "widthMode":I
a=0;//     #v18=(Integer);
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     .line 1325
a=0;//     .local v8, "heightMode":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v21, 0x30
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v21, 0x50
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1326
a=0;//     .local v7, "consumeVertical":Z
a=0;//     :goto_1
a=0;//     #v7=(Boolean);
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v11, v0, :cond_1
a=0;// 
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-ne v11, v0, :cond_7
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 1328
a=0;//     .local v6, "consumeHorizontal":Z
a=0;//     :goto_2
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 1329
a=0;//     const/high16 v18, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1334
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     move/from16 v19, v5
a=0;// 
a=0;//     .line 1335
a=0;//     .local v19, "widthSize":I
a=0;//     #v19=(Integer);
a=0;//     move v9, v4
a=0;// 
a=0;//     .line 1336
a=0;//     .local v9, "heightSize":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1337
a=0;//     const/high16 v18, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1338
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1339
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     .line 1342
a=0;//     :cond_3
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     .line 1343
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1344
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     .line 1345
a=0;//     iget v9, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     .line 1348
a=0;//     :cond_4
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1349
a=0;//     .local v20, "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     invoke-static {v9, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1350
a=0;//     .local v10, "heightSpec":I
a=0;//     #v10=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v3, v0, v10}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1352
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 1353
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v4, v4, v21
a=0;// 
a=0;//     .line 1316
a=0;//     .end local v6    # "consumeHorizontal":Z
a=0;//     .end local v7    # "consumeVertical":Z
a=0;//     .end local v8    # "heightMode":I
a=0;//     .end local v9    # "heightSize":I
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v17    # "vgrav":I
a=0;//     .end local v18    # "widthMode":I
a=0;//     .end local v19    # "widthSize":I
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1325
a=0;//     .restart local v8    # "heightMode":I
a=0;//     .restart local v11    # "hgrav":I
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .restart local v17    # "vgrav":I
a=0;//     .restart local v18    # "widthMode":I
a=0;//     :cond_6
a=0;//     #v1=(PosByte);v8=(Integer);v11=(Integer);v13=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v17=(Integer);v18=(Integer);v21=(PosByte);v22=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1326
a=0;//     .restart local v7    # "consumeVertical":Z
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v7=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1330
a=0;//     .restart local v6    # "consumeHorizontal":Z
a=0;//     :cond_8
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 1331
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1354
a=0;//     .restart local v9    # "heightSize":I
a=0;//     .restart local v10    # "heightSpec":I
a=0;//     .restart local v19    # "widthSize":I
a=0;//     .restart local v20    # "widthSpec":I
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Integer);v9=(Integer);v10=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Byte);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 1355
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v5, v5, v21
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1361
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v6    # "consumeHorizontal":Z
a=0;//     .end local v7    # "consumeVertical":Z
a=0;//     .end local v8    # "heightMode":I
a=0;//     .end local v9    # "heightSize":I
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v17    # "vgrav":I
a=0;//     .end local v18    # "widthMode":I
a=0;//     .end local v19    # "widthSize":I
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Integer);
a=0;//     const/high16 v21, 0x40000000    # 2.0f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildWidthMeasureSpec:I
a=0;// 
a=0;//     .line 1362
a=0;//     const/high16 v21, 0x40000000    # 2.0f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v4, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     .line 1365
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1366
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1367
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1370
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1371
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);v1=(Conflicted);v21=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v12, v0, :cond_d
a=0;// 
a=0;//     .line 1372
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1373
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     const/16 v22, 0x8
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_c
a=0;// 
a=0;//     .line 1377
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1378
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     if-eqz v13, :cond_b
a=0;// 
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-nez v21, :cond_c
a=0;// 
a=0;//     .line 1379
a=0;//     :cond_b
a=0;//     #v0=(Integer);v21=(Integer);
a=0;//     int-to-float v0, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Float);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     mul-float v21, v21, v22
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/high16 v22, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1381
a=0;//     .restart local v20    # "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1371
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_c
a=0;//     #v13=(Conflicted);v20=(Conflicted);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1385
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPageScrolled(IFI)V
a=0;//     .locals 17
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "offset"    # F
a=0;//     .param p3, "offsetPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1599
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-lez v15, :cond_2
a=0;// 
a=0;//     .line 1600
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1601
a=0;//     .local v12, "scrollX":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1602
a=0;//     .local v10, "paddingLeft":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1603
a=0;//     .local v11, "paddingRight":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1604
a=0;//     .local v14, "width":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1605
a=0;//     .local v4, "childCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v16=(Conflicted);
a=0;//     if-ge v8, v4, :cond_2
a=0;// 
a=0;//     .line 1606
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1607
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1608
a=0;//     .local v9, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_1
a=0;// 
a=0;//     .line 1605
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1610
a=0;//     :cond_1
a=0;//     #v15=(Boolean);
a=0;//     iget v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     and-int/lit8 v7, v15, 0x7
a=0;// 
a=0;//     .line 1611
a=0;//     .local v7, "hgrav":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1612
a=0;//     .local v5, "childLeft":I
a=0;//     #v5=(Null);
a=0;//     packed-switch v7, :pswitch_data_0
a=0;// 
a=0;//     .line 1614
a=0;//     :pswitch_0
a=0;//     move v5, v10
a=0;// 
a=0;//     .line 1629
a=0;//     :goto_2
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v12
a=0;// 
a=0;//     .line 1631
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     sub-int v6, v5, v15
a=0;// 
a=0;//     .line 1632
a=0;//     .local v6, "childOffset":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1633
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1617
a=0;//     .end local v6    # "childOffset":I
a=0;//     :pswitch_1
a=0;//     #v5=(Null);v6=(Conflicted);
a=0;//     move v5, v10
a=0;// 
a=0;//     .line 1618
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     add-int/2addr v10, v15
a=0;// 
a=0;//     .line 1619
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1621
a=0;//     :pswitch_2
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     sub-int v15, v14, v15
a=0;// 
a=0;//     div-int/lit8 v15, v15, 0x2
a=0;// 
a=0;//     invoke-static {v15, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1623
a=0;//     #v5=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1625
a=0;//     :pswitch_3
a=0;//     #v5=(Null);
a=0;//     sub-int v15, v14, v11
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     sub-int v5, v15, v16
a=0;// 
a=0;//     .line 1626
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     add-int/2addr v11, v15
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1638
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childCount":I
a=0;//     .end local v5    # "childLeft":I
a=0;//     .end local v7    # "hgrav":I
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v10    # "paddingLeft":I
a=0;//     .end local v11    # "paddingRight":I
a=0;//     .end local v12    # "scrollX":I
a=0;//     .end local v14    # "width":I
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     if-ltz v15, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v15, :cond_4
a=0;// 
a=0;//     .line 1639
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mSeenPositionMin:I
a=0;// 
a=0;//     .line 1641
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     if-ltz v15, :cond_5
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v15, v0
a=0;// 
a=0;//     #v15=(Float);
a=0;//     add-float v15, v15, p2
a=0;// 
a=0;//     invoke-static {v15}, Landroid/util/FloatMath;->ceil(F)F
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     cmpl-float v15, v15, v16
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-lez v15, :cond_6
a=0;// 
a=0;//     .line 1642
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v15=(Integer);v16=(Conflicted);
a=0;//     add-int/lit8 v15, p1, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v15, v0, Landroid/support/v4/view/ViewPager;->mSeenPositionMax:I
a=0;// 
a=0;//     .line 1645
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v15, :cond_7
a=0;// 
a=0;//     .line 1646
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1648
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     if-eqz v15, :cond_8
a=0;// 
a=0;//     .line 1649
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1652
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     if-eqz v15, :cond_a
a=0;// 
a=0;//     .line 1653
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1654
a=0;//     .restart local v12    # "scrollX":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1655
a=0;//     .restart local v4    # "childCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .restart local v8    # "i":I
a=0;//     :goto_3
a=0;//     #v8=(Integer);v13=(Conflicted);v15=(Conflicted);
a=0;//     if-ge v8, v4, :cond_a
a=0;// 
a=0;//     .line 1656
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1657
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1659
a=0;//     .restart local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_9
a=0;// 
a=0;//     .line 1655
a=0;//     :goto_4
a=0;//     #v15=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1661
a=0;//     :cond_9
a=0;//     #v15=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     sub-int/2addr v15, v12
a=0;// 
a=0;//     int-to-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v13, v15, v16
a=0;// 
a=0;//     .line 1662
a=0;//     .local v13, "transformPos":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     invoke-interface {v15, v3, v13}, Landroid/support/v4/view/ViewPager$PageTransformer;->transformPage(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1666
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childCount":I
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v12    # "scrollX":I
a=0;//     .end local v13    # "transformPos":F
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v15, v0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1667
a=0;//     return-void
a=0;// 
a=0;//     .line 1612
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
a=0;//     .locals 9
a=0;//     .param p1, "direction"    # I
a=0;//     .param p2, "previouslyFocusedRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2577
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2578
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v7, p1, 0x2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 2579
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 2580
a=0;//     .local v6, "index":I
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 2581
a=0;//     .local v5, "increment":I
a=0;//     #v5=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 2587
a=0;//     .local v2, "end":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Byte);v6=(Integer);
a=0;//     move v3, v6
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     if-eq v3, v2, :cond_2
a=0;// 
a=0;//     .line 2588
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2589
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 2590
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2591
a=0;//     .local v4, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v7, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v7, v8, :cond_1
a=0;// 
a=0;//     .line 2592
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 2593
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 2598
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 2583
a=0;//     .end local v2    # "end":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "increment":I
a=0;//     .end local v6    # "index":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     add-int/lit8 v6, v1, -0x1
a=0;// 
a=0;//     .line 2584
a=0;//     .restart local v6    # "index":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 2585
a=0;//     .restart local v5    # "increment":I
a=0;//     #v5=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .restart local v2    # "end":I
a=0;//     #v2=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2587
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Integer);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     add-int/2addr v3, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2598
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 4
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1211
a=0;//     instance-of v1, p1, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1212
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1227
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 1216
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     .line 1217
a=0;//     .local v0, "ss":Landroid/support/v4/view/ViewPager$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1219
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1220
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     iget-object v3, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 1221
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1223
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 1224
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1225
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1200
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1201
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1202
a=0;//     .local v0, "ss":Landroid/support/v4/view/ViewPager$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     .line 1203
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1204
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->saveState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1206
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 2
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1389
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 1392
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 1393
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, p3, v0, v1}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 1395
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 27
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1858
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-eqz v23, :cond_0
a=0;// 
a=0;//     .line 1862
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     .line 1972
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     return v23
a=0;// 
a=0;//     .line 1865
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     if-nez v23, :cond_1
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     if-eqz v23, :cond_1
a=0;// 
a=0;//     .line 1868
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1871
a=0;//     :cond_1
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v23, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     if-nez v23, :cond_3
a=0;// 
a=0;//     .line 1873
a=0;//     :cond_2
a=0;//     #v23=(Conflicted);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1876
a=0;//     :cond_3
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v23, :cond_4
a=0;// 
a=0;//     .line 1877
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-object v0, v1, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1879
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1881
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1882
a=0;//     .local v5, "action":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1884
a=0;//     .local v11, "needsInvalidate":Z
a=0;//     #v11=(Null);
a=0;//     and-int/lit16 v0, v5, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     packed-switch v23, :pswitch_data_0
a=0;// 
a=0;//     .line 1969
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     if-eqz v11, :cond_6
a=0;// 
a=0;//     .line 1970
a=0;//     invoke-static/range {p0 .. p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1972
a=0;//     :cond_6
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1886
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Integer);v24=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1887
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1888
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1889
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1890
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1893
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1894
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1898
a=0;//     :pswitch_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_7
a=0;// 
a=0;//     .line 1899
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1900
a=0;//     .local v14, "pointerIndex":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v14}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1901
a=0;//     .local v19, "x":F
a=0;//     #v19=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     sub-float v23, v19, v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1902
a=0;//     .local v20, "xDiff":F
a=0;//     #v20=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v14}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 1903
a=0;//     .local v21, "y":F
a=0;//     #v21=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     sub-float v23, v21, v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 1905
a=0;//     .local v22, "yDiff":F
a=0;//     #v22=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Float);
a=0;//     cmpl-float v23, v20, v23
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-lez v23, :cond_7
a=0;// 
a=0;//     cmpl-float v23, v20, v22
a=0;// 
a=0;//     if-lez v23, :cond_7
a=0;// 
a=0;//     .line 1907
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1908
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     sub-float v23, v19, v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     cmpl-float v23, v23, v24
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-lez v23, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Float);
a=0;//     add-float v23, v23, v24
a=0;// 
a=0;//     :goto_2
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1910
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1911
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1915
a=0;//     .end local v14    # "pointerIndex":I
a=0;//     .end local v19    # "x":F
a=0;//     .end local v20    # "xDiff":F
a=0;//     .end local v21    # "y":F
a=0;//     .end local v22    # "yDiff":F
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v14=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Byte);v24=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-eqz v23, :cond_5
a=0;// 
a=0;//     .line 1917
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1919
a=0;//     .local v6, "activePointerIndex":I
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1920
a=0;//     .restart local v19    # "x":F
a=0;//     #v19=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     or-int v11, v11, v23
a=0;// 
a=0;//     .line 1921
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1908
a=0;//     .end local v6    # "activePointerIndex":I
a=0;//     .restart local v14    # "pointerIndex":I
a=0;//     .restart local v20    # "xDiff":F
a=0;//     .restart local v21    # "y":F
a=0;//     .restart local v22    # "yDiff":F
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Reference,Landroid/support/v4/view/ViewPager;);v6=(Uninit);v11=(Null);v14=(Integer);v20=(Float);v21=(Float);v22=(Float);v23=(Byte);v24=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Float);
a=0;//     sub-float v23, v23, v24
a=0;// 
a=0;//     #v23=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1924
a=0;//     .end local v14    # "pointerIndex":I
a=0;//     .end local v19    # "x":F
a=0;//     .end local v20    # "xDiff":F
a=0;//     .end local v21    # "y":F
a=0;//     .end local v22    # "yDiff":F
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v14=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Integer);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-eqz v23, :cond_5
a=0;// 
a=0;//     .line 1925
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     .line 1926
a=0;//     .local v17, "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     #v17=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v23, 0x3e8
a=0;// 
a=0;//     #v23=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 1927
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 1929
a=0;//     .local v10, "initialVelocity":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1930
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1931
a=0;//     .local v18, "width":I
a=0;//     #v18=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1932
a=0;//     .local v15, "scrollX":I
a=0;//     #v15=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1933
a=0;//     .local v8, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v8=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v7, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1934
a=0;//     .local v7, "currentPage":I
a=0;//     #v7=(Integer);
a=0;//     int-to-float v0, v15
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     div-float v23, v23, v24
a=0;// 
a=0;//     iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     sub-float v23, v23, v24
a=0;// 
a=0;//     iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     div-float v13, v23, v24
a=0;// 
a=0;//     .line 1935
a=0;//     .local v13, "pageOffset":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1937
a=0;//     .restart local v6    # "activePointerIndex":I
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1938
a=0;//     .restart local v19    # "x":F
a=0;//     #v19=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     sub-float v23, v19, v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 1939
a=0;//     .local v16, "totalDelta":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     invoke-direct {v0, v7, v13, v10, v1}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1941
a=0;//     .local v12, "nextPage":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v12, v1, v2, v10}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 1943
a=0;//     const/16 v23, -0x1
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1944
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 1945
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     or-int v11, v23, v24
a=0;// 
a=0;//     .line 1946
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1949
a=0;//     .end local v6    # "activePointerIndex":I
a=0;//     .end local v7    # "currentPage":I
a=0;//     .end local v8    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v10    # "initialVelocity":I
a=0;//     .end local v12    # "nextPage":I
a=0;//     .end local v13    # "pageOffset":F
a=0;//     .end local v15    # "scrollX":I
a=0;//     .end local v16    # "totalDelta":I
a=0;//     .end local v17    # "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     .end local v18    # "width":I
a=0;//     .end local v19    # "x":F
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v2=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v23=(Integer);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-eqz v23, :cond_5
a=0;// 
a=0;//     .line 1950
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move/from16 v4, v26
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     .line 1951
a=0;//     const/16 v23, -0x1
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1952
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 1953
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     or-int v11, v23, v24
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1957
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v11=(Null);v23=(Integer);v24=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1958
a=0;//     .local v9, "index":I
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1959
a=0;//     .restart local v19    # "x":F
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1960
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1964
a=0;//     .end local v9    # "index":I
a=0;//     .end local v19    # "x":F
a=0;//     :pswitch_6
a=0;//     #v9=(Uninit);v19=(Uninit);
a=0;//     invoke-direct/range {p0 .. p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1965
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1884
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method pageLeft()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2490
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 2491
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2494
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method pageRight()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2498
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 2499
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2502
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
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
a=0;// .method populate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 881
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 882
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method populate(I)V
a=0;//     .locals 26
a=0;//     .param p1, "newCurrentItem"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 886
a=0;//     .local v18, "oldCurInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v18=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 887
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 888
a=0;//     #v18=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 891
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-nez v23, :cond_2
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 899
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Reference,Landroid/support/v4/view/PagerAdapter;);v24=(Uninit);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_1
a=0;// 
a=0;//     .line 907
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/os/IBinder;);
a=0;//     if-eqz v23, :cond_1
a=0;// 
a=0;//     .line 911
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 913
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     .line 914
a=0;//     .local v19, "pageLimit":I
a=0;//     #v19=(Integer);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     sub-int v24, v24, v19
a=0;// 
a=0;//     invoke-static/range {v23 .. v24}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 915
a=0;//     .local v22, "startPos":I
a=0;//     #v22=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual/range {v23 .. v23}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 916
a=0;//     .local v4, "N":I
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v23, v4, -0x1
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     add-int v24, v24, v19
a=0;// 
a=0;//     invoke-static/range {v23 .. v24}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 919
a=0;//     .local v10, "endPos":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     .line 920
a=0;//     .local v7, "curIndex":I
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 921
a=0;//     .local v8, "curItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v7=(Integer);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v7, v0, :cond_3
a=0;// 
a=0;//     .line 922
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 923
a=0;//     .local v14, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_b
a=0;// 
a=0;//     .line 924
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     move-object v8, v14
a=0;// 
a=0;//     .line 929
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v8=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v14=(Conflicted);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     if-lez v4, :cond_4
a=0;// 
a=0;//     .line 930
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v7}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 936
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     .line 937
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 938
a=0;//     .local v11, "extraWidthLeft":F
a=0;//     #v11=(Null);
a=0;//     add-int/lit8 v15, v7, -0x1
a=0;// 
a=0;//     .line 939
a=0;//     .local v15, "itemIndex":I
a=0;//     #v15=(Integer);
a=0;//     if-ltz v15, :cond_c
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     .line 940
a=0;//     .restart local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v23=(Conflicted);
a=0;//     const/high16 v23, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     sub-float v16, v23, v24
a=0;// 
a=0;//     .line 941
a=0;//     .local v16, "leftWidthNeeded":F
a=0;//     #v16=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     add-int/lit8 v20, v23, -0x1
a=0;// 
a=0;//     .local v20, "pos":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v11=(Float);v20=(Integer);v23=(Conflicted);v24=(Conflicted);
a=0;//     if-ltz v20, :cond_5
a=0;// 
a=0;//     .line 942
a=0;//     cmpl-float v23, v11, v16
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-ltz v23, :cond_10
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_10
a=0;// 
a=0;//     .line 943
a=0;//     if-nez v14, :cond_d
a=0;// 
a=0;//     .line 969
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);
a=0;//     iget v12, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 970
a=0;//     .local v12, "extraWidthRight":F
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v15, v7, 0x1
a=0;// 
a=0;//     .line 971
a=0;//     const/high16 v23, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     cmpg-float v23, v12, v23
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-gez v23, :cond_6
a=0;// 
a=0;//     .line 972
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v15, v0, :cond_14
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     .line 973
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     add-int/lit8 v20, v23, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v4, :cond_6
a=0;// 
a=0;//     .line 974
a=0;//     const/high16 v23, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     cmpl-float v23, v12, v23
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-ltz v23, :cond_18
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     if-le v0, v10, :cond_18
a=0;// 
a=0;//     .line 975
a=0;//     if-nez v14, :cond_15
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0, v8, v7, v1}, Landroid/support/v4/view/ViewPager;->calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;// 
a=0;//     .line 1010
a=0;//     .end local v11    # "extraWidthLeft":F
a=0;//     .end local v12    # "extraWidthRight":F
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v15    # "itemIndex":I
a=0;//     .end local v16    # "leftWidthNeeded":F
a=0;//     .end local v20    # "pos":I
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-eqz v8, :cond_1c
a=0;// 
a=0;//     iget-object v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v23=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v23
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1012
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 1016
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     if-eqz v23, :cond_1d
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     .line 1017
a=0;//     .local v21, "sort":Z
a=0;//     :goto_6
a=0;//     #v21=(Boolean);
a=0;//     if-eqz v21, :cond_8
a=0;// 
a=0;//     .line 1018
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v23, :cond_1e
a=0;// 
a=0;//     .line 1019
a=0;//     new-instance v23, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1024
a=0;//     :cond_8
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1025
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i":I
a=0;//     :goto_8
a=0;//     #v5=(Conflicted);v13=(Integer);v17=(Conflicted);
a=0;//     if-ge v13, v6, :cond_1f
a=0;// 
a=0;//     .line 1026
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v13}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1027
a=0;//     .local v5, "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1028
a=0;//     .local v17, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iput v13, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 1029
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     cmpl-float v23, v23, v24
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     if-nez v23, :cond_9
a=0;// 
a=0;//     .line 1031
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1032
a=0;//     .restart local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v14, :cond_9
a=0;// 
a=0;//     .line 1033
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 1034
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     .line 1037
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v14=(Conflicted);v24=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v21, :cond_a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1025
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 921
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v6    # "childCount":I
a=0;//     .end local v13    # "i":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v21    # "sort":Z
a=0;//     .restart local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Null);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v15=(Uninit);v16=(Uninit);v17=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Integer);v24=(Integer);v25=(Uninit);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 939
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v11    # "extraWidthLeft":F
a=0;//     .restart local v15    # "itemIndex":I
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v11=(Null);v14=(Conflicted);v15=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 946
a=0;//     .restart local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v16    # "leftWidthNeeded":F
a=0;//     .restart local v20    # "pos":I
a=0;//     :cond_d
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v11=(Float);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v16=(Float);v20=(Integer);v23=(Byte);v24=(Conflicted);
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     if-ne v0, v1, :cond_e
a=0;// 
a=0;//     iget-boolean v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_e
a=0;// 
a=0;//     .line 947
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 948
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     iget-object v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v24
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 953
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     .line 954
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     .line 955
a=0;//     if-ltz v15, :cond_f
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     .line 941
a=0;//     :cond_e
a=0;//     :goto_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     add-int/lit8 v20, v20, -0x1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 955
a=0;//     :cond_f
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);v1=(Reference,Landroid/support/v4/view/ViewPager;);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v23=(Reference,Landroid/support/v4/view/PagerAdapter;);v24=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 957
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v23=(Byte);v24=(Conflicted);
a=0;//     if-eqz v14, :cond_12
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_12
a=0;// 
a=0;//     .line 958
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     add-float v11, v11, v23
a=0;// 
a=0;//     .line 959
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     .line 960
a=0;//     if-ltz v15, :cond_11
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     :goto_a
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Integer);v23=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 962
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     add-int/lit8 v23, v15, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 963
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     add-float v11, v11, v23
a=0;// 
a=0;//     .line 964
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     .line 965
a=0;//     if-ltz v15, :cond_13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Integer);v23=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 972
a=0;//     .restart local v12    # "extraWidthRight":F
a=0;//     :cond_14
a=0;//     #v1=(Conflicted);v2=(Conflicted);v12=(Integer);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 978
a=0;//     :cond_15
a=0;//     #v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v23=(Byte);
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_16
a=0;// 
a=0;//     iget-boolean v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_16
a=0;// 
a=0;//     .line 979
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 980
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     iget-object v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v24
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 985
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v15, v0, :cond_17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     .line 973
a=0;//     :cond_16
a=0;//     :goto_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 985
a=0;//     :cond_17
a=0;//     #v0=(Integer);v1=(Reference,Landroid/support/v4/view/ViewPager;);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v23=(Integer);v24=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 987
a=0;//     :cond_18
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v23=(Byte);v24=(Conflicted);
a=0;//     if-eqz v14, :cond_1a
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1a
a=0;// 
a=0;//     .line 988
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     add-float v12, v12, v23
a=0;// 
a=0;//     .line 989
a=0;//     #v12=(Float);
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     .line 990
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v15, v0, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     :goto_d
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :cond_19
a=0;//     #v0=(Integer);v23=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 992
a=0;//     :cond_1a
a=0;//     #v1=(Conflicted);v12=(Integer);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 993
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     .line 994
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     add-float v12, v12, v23
a=0;// 
a=0;//     .line 995
a=0;//     #v12=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v15, v0, :cond_1b
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v14, v23
a=0;// 
a=0;//     :goto_e
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :cond_1b
a=0;//     #v0=(Integer);v23=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 1010
a=0;//     .end local v11    # "extraWidthLeft":F
a=0;//     .end local v12    # "extraWidthRight":F
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v15    # "itemIndex":I
a=0;//     .end local v16    # "leftWidthNeeded":F
a=0;//     .end local v20    # "pos":I
a=0;//     :cond_1c
a=0;//     #v1=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v23=(Conflicted);v24=(Reference,Landroid/support/v4/view/PagerAdapter;);v25=(Integer);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_1d
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v23=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 1021
a=0;//     .restart local v21    # "sort":Z
a=0;//     :cond_1e
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v21=(Boolean);v23=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 1039
a=0;//     .restart local v6    # "childCount":I
a=0;//     .restart local v13    # "i":I
a=0;//     :cond_1f
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Integer);v13=(Integer);v17=(Conflicted);v23=(Conflicted);
a=0;//     if-eqz v21, :cond_20
a=0;// 
a=0;//     .line 1040
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v23, v0
a=0;// 
a=0;//     #v23=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v24, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     invoke-static/range {v23 .. v24}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 1043
a=0;//     :cond_20
a=0;//     #v0=(Conflicted);v23=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->hasFocus()Z
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-eqz v23, :cond_1
a=0;// 
a=0;//     .line 1044
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 1045
a=0;//     .local v9, "currentFocused":Landroid/view/View;
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-eqz v9, :cond_23
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v9}, Landroid/support/v4/view/ViewPager;->infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1046
a=0;//     .restart local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_f
a=0;//     #v0=(Conflicted);v14=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v14, :cond_21
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 1047
a=0;//     :cond_21
a=0;//     #v0=(Conflicted);v1=(Conflicted);v24=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     :goto_10
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v13, v0, :cond_1
a=0;// 
a=0;//     .line 1048
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v13}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1049
a=0;//     .restart local v5    # "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1050
a=0;//     if-eqz v14, :cond_22
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_22
a=0;// 
a=0;//     .line 1051
a=0;//     const/16 v23, 0x2
a=0;// 
a=0;//     #v23=(PosByte);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Landroid/view/View;->requestFocus(I)Z
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Boolean);
a=0;//     if-nez v23, :cond_1
a=0;// 
a=0;//     .line 1047
a=0;//     :cond_22
a=0;//     #v0=(Conflicted);v1=(Conflicted);v23=(Integer);v24=(Conflicted);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_10
a=0;// 
a=0;//     .line 1045
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v14    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_23
a=0;//     #v1=(Reference,Ujava/lang/Object;);v5=(Conflicted);v14=(Conflicted);v23=(Boolean);v24=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_f
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 9
a=0;//     .param p1, "adapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 403
a=0;//     #v6=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 406
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 408
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, p0, v4, v5}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 406
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 410
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 412
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->removeNonDecorViews()V
a=0;// 
a=0;//     .line 413
a=0;//     iput v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 414
a=0;//     invoke-virtual {p0, v6, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 417
a=0;//     .end local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 418
a=0;//     .local v2, "oldAdapter":Landroid/support/v4/view/PagerAdapter;
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 420
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 422
a=0;//     new-instance v3, Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-direct {v3, p0, v7}, Landroid/support/v4/view/ViewPager$PagerObserver;-><init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/ViewPager$1;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     .line 424
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 425
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 426
a=0;//     iput-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 427
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_5
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 429
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3, v6, v8}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 430
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 431
a=0;//     iput-object v7, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 432
a=0;//     iput-object v7, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 438
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     if-eq v2, p1, :cond_4
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, v2, p1}, Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;->onAdapterChanged(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 441
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .line 434
a=0;//     :cond_5
a=0;//     #v3=(Integer);v4=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setChildrenDrawingOrderEnabledCompat(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     :try_start_0
a=0;//     const-class v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     const-string v2, "setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 603
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 607
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 598
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 599
a=0;//     .local v0, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     const-string v2, "Can\'t find setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 604
a=0;//     .end local v0    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 605
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     const-string v2, "Error changing children drawing order"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "item"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 475
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 476
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 477
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 476
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 486
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 487
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 488
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 496
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZI)V
a=0;//     .locals 5
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;//     .param p4, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 499
a=0;//     #v4=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     .line 500
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 525
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 503
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v3, p1, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 504
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     if-gez p1, :cond_5
a=0;// 
a=0;//     .line 509
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 513
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 514
a=0;//     .local v2, "pageLimit":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/2addr v3, v2
a=0;// 
a=0;//     if-gt p1, v3, :cond_4
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     sub-int/2addr v3, v2
a=0;// 
a=0;//     if-ge p1, v3, :cond_6
a=0;// 
a=0;//     .line 518
a=0;//     :cond_4
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_6
a=0;// 
a=0;//     .line 519
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iput-boolean v0, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     .line 518
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 510
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "pageLimit":I
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt p1, v3, :cond_3
a=0;// 
a=0;//     .line 511
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 p1, v3, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 522
a=0;//     .restart local v2    # "pageLimit":I
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-eq v3, p1, :cond_7
a=0;// 
a=0;//     .line 523
a=0;//     .local v0, "dispatchSelected":Z
a=0;//     :goto_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 524
a=0;//     invoke-direct {p0, p1, p2, p4, v0}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "dispatchSelected":Z
a=0;//     :cond_7
a=0;//     #v0=(One);
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 522
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 624
a=0;//     .local v0, "oldListener":Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 625
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setOffscreenPageLimit(I)V
a=0;//     .locals 4
a=0;//     .param p1, "limit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 657
a=0;//     #v3=(One);
a=0;//     if-ge p1, v3, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     const-string v0, "ViewPager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Requested offscreen page limit "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " too small; defaulting to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 660
a=0;//     const/4 p1, 0x1
a=0;// 
a=0;//     .line 662
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 663
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 664
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 666
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     .line 465
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 564
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMargin(I)V
a=0;//     .locals 2
a=0;//     .param p1, "marginPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 678
a=0;//     .local v0, "oldMargin":I
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 680
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 681
a=0;//     .local v1, "width":I
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, v1, p1, v0}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 683
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 684
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 714
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 701
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 702
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->refreshDrawableState()V
a=0;// 
a=0;//     .line 703
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 704
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->invalidate()V
a=0;// 
a=0;//     .line 705
a=0;//     return-void
a=0;// 
a=0;//     .line 703
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V
a=0;//     .locals 6
a=0;//     .param p1, "reverseDrawingOrder"    # Z
a=0;//     .param p2, "transformer"    # Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 579
a=0;//     #v3=(Null);
a=0;//     sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v4, v5, :cond_1
a=0;// 
a=0;//     .line 580
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 581
a=0;//     .local v0, "hasTransformer":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     if-eq v0, v4, :cond_4
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 582
a=0;//     .local v1, "needsPopulate":Z
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iput-object p2, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     .line 583
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingOrderEnabledCompat(Z)V
a=0;// 
a=0;//     .line 584
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 585
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     .line 589
a=0;//     :goto_3
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 591
a=0;//     .end local v0    # "hasTransformer":Z
a=0;//     .end local v1    # "needsPopulate":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 580
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "hasTransformer":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v4=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 581
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 587
a=0;//     .restart local v1    # "needsPopulate":Z
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(II)V
a=0;//     .locals 1
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 747
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 748
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(III)V
a=0;//     .locals 15
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;//     .param p3, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 758
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 760
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 796
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/widget/Scroller;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 763
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 764
a=0;//     .local v2, "sx":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 765
a=0;//     .local v3, "sy":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p1, v2
a=0;// 
a=0;//     .line 766
a=0;//     .local v4, "dx":I
a=0;//     #v4=(Integer);
a=0;//     sub-int v5, p2, v3
a=0;// 
a=0;//     .line 767
a=0;//     .local v5, "dy":I
a=0;//     #v5=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 768
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 769
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 770
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 774
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 775
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 777
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 778
a=0;//     .local v12, "width":I
a=0;//     #v12=(Integer);
a=0;//     div-int/lit8 v9, v12, 0x2
a=0;// 
a=0;//     .line 779
a=0;//     .local v9, "halfWidth":I
a=0;//     #v9=(Integer);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v13, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-float v14, v14
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     div-float/2addr v13, v14
a=0;// 
a=0;//     invoke-static {v1, v13}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 780
a=0;//     .local v8, "distanceRatio":F
a=0;//     #v8=(Float);
a=0;//     int-to-float v1, v9
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v13, v9
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->distanceInfluenceForSnapDuration(F)F
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     mul-float/2addr v13, v14
a=0;// 
a=0;//     add-float v7, v1, v13
a=0;// 
a=0;//     .line 783
a=0;//     .local v7, "distance":F
a=0;//     #v7=(Float);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 784
a=0;//     .local v6, "duration":I
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result p3
a=0;// 
a=0;//     .line 785
a=0;//     if-lez p3, :cond_2
a=0;// 
a=0;//     .line 786
a=0;//     const/high16 v1, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v13, v0
a=0;// 
a=0;//     div-float v13, v7, v13
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     mul-float/2addr v1, v13
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v6, v1, 0x4
a=0;// 
a=0;//     .line 792
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Integer);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(Integer);
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 795
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 788
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Float);v6=(Null);v10=(Uninit);v11=(Uninit);v13=(Float);v14=(Float);
a=0;//     int-to-float v1, v12
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v14, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     mul-float v11, v1, v13
a=0;// 
a=0;//     .line 789
a=0;//     .local v11, "pageWidth":F
a=0;//     #v11=(Float);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v11
a=0;// 
a=0;//     div-float v10, v1, v13
a=0;// 
a=0;//     .line 790
a=0;//     .local v10, "pageDelta":F
a=0;//     #v10=(Float);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v1, v10
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v13, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     mul-float/2addr v1, v13
a=0;// 
a=0;//     float-to-int v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 718
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
