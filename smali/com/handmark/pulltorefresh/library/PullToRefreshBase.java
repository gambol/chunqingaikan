package com.handmark.pulltorefresh.library; class PullToRefreshBase { void a() { int a;
a=0;// .class public abstract Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "PullToRefreshBase.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/IPullToRefresh;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Landroid/view/View;",
a=0;//         ">",
a=0;//         "Landroid/widget/LinearLayout;",
a=0;//         "Lcom/handmark/pulltorefresh/library/IPullToRefresh",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I = null
a=0;// 
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I = null
a=0;// 
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$State:[I = null
a=0;// 
a=0;// .field static final DEBUG:Z = true
a=0;// 
a=0;// .field static final DEMO_SCROLL_INTERVAL:I = 0xe1
a=0;// 
a=0;// .field static final FRICTION:F = 2.0f
a=0;// 
a=0;// .field static final LOG_TAG:Ljava/lang/String; = "PullToRefresh"
a=0;// 
a=0;// .field public static final SMOOTH_SCROLL_DURATION_MS:I = 0xc8
a=0;// 
a=0;// .field public static final SMOOTH_SCROLL_LONG_DURATION_MS:I = 0x145
a=0;// 
a=0;// .field static final STATE_CURRENT_MODE:Ljava/lang/String; = "ptr_current_mode"
a=0;// 
a=0;// .field static final STATE_MODE:Ljava/lang/String; = "ptr_mode"
a=0;// 
a=0;// .field static final STATE_SCROLLING_REFRESHING_ENABLED:Ljava/lang/String; = "ptr_disable_scrolling"
a=0;// 
a=0;// .field static final STATE_SHOW_REFRESHING_VIEW:Ljava/lang/String; = "ptr_show_refreshing_view"
a=0;// 
a=0;// .field static final STATE_STATE:Ljava/lang/String; = "ptr_state"
a=0;// 
a=0;// .field static final STATE_SUPER:Ljava/lang/String; = "ptr_super"
a=0;// 
a=0;// .field static final USE_HW_LAYERS:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field private mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//             "<TT;>.SmoothScrollRunnable;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mFilterTouchEvents:Z
a=0;// 
a=0;// .field private mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;// .field private mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mLastMotionX:F
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field private mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;// .field private mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;// .field private mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field private mOnPullEventListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mOverScrollEnabled:Z
a=0;// 
a=0;// .field public mRefreshableView:Landroid/view/View;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private mScrollAnimationInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;// .field private mShowViewWhileRefreshing:Z
a=0;// 
a=0;// .field private mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$State()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$State:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_5
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->OVERSCROLLING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_4
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_0
a=0;// 
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$State:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 107
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 85
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 86
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     .line 87
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 88
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 112
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 85
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 86
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     .line 87
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 88
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 113
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 117
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 85
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 86
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     .line 87
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 88
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 118
a=0;//     iput-object p2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 119
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "animStyle":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 123
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 85
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 86
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     .line 87
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 88
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 124
a=0;//     iput-object p2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 125
a=0;//     iput-object p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollAnimationInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1060
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->callRefreshListener()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1246
a=0;//     invoke-direct/range {p0 .. p6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addRefreshableView(Landroid/content/Context;Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "refreshableView":Landroid/view/View;, "TT;"
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 1052
a=0;//     #v2=(Byte);
a=0;//     new-instance v0, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 1053
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p2, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 1056
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 1057
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1056
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->addViewInternal(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1058
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private callRefreshListener()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1061
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1062
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;->onRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1063
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1064
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 1065
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;->onPullDownToRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1067
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;->onPullUpToRefresh(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getLoadingLayoutLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     .line 1215
a=0;//     #v2=(Byte);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1221
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1217
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1215
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private getMaximumPullScroll()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 1227
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1232
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 1229
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1227
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 10
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/16 v9, 0xc
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0x9
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1074
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v3, v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 1080
a=0;//     invoke-virtual {p0, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setOrientation(I)V
a=0;// 
a=0;//     .line 1084
a=0;//     :goto_0
a=0;//     const/16 v3, 0x11
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setGravity(I)V
a=0;// 
a=0;//     .line 1086
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1087
a=0;//     .local v2, "config":Landroid/view/ViewConfiguration;
a=0;//     #v2=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mTouchSlop:I
a=0;// 
a=0;//     .line 1090
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/R$styleable;->PullToRefresh:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1092
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1093
a=0;//     invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1096
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v0, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1097
a=0;//     invoke-virtual {v0, v9, v5}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 1103
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     .line 1104
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     invoke-direct {p0, p1, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->addRefreshableView(Landroid/content/Context;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1107
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v3, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 1108
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v3, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 1113
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 1114
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1115
a=0;//     .local v1, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1116
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1126
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 1127
a=0;//     invoke-virtual {v0, v8, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput-boolean v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 1130
a=0;//     :cond_3
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 1132
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     .line 1131
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 1137
a=0;//     :cond_4
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->handleStyledAttributes(Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     .line 1138
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1141
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->updateUIForMode()V
a=0;// 
a=0;//     .line 1142
a=0;//     return-void
a=0;// 
a=0;//     .line 1076
a=0;//     .end local v0    # "a":Landroid/content/res/TypedArray;
a=0;//     .end local v2    # "config":Landroid/view/ViewConfiguration;
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setOrientation(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1118
a=0;//     .restart local v0    # "a":Landroid/content/res/TypedArray;
a=0;//     .restart local v2    # "config":Landroid/view/ViewConfiguration;
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);v2=(Reference,Landroid/view/ViewConfiguration;);v3=(Boolean);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1119
a=0;//     const-string v3, "ptrAdapterViewBackground"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "ptrRefreshableViewBackground"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/handmark/pulltorefresh/library/internal/Utils;->warnDeprecation(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1120
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1121
a=0;//     .restart local v1    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1122
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1074
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private isReadyForPull()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1145
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 1153
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 1147
a=0;//     :pswitch_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullStart()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1149
a=0;//     :pswitch_1
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullEnd()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1151
a=0;//     :pswitch_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullEnd()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullStart()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1145
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private pullEvent()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/high16 v8, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1168
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 1175
a=0;//     iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionY:F
a=0;// 
a=0;//     .line 1176
a=0;//     .local v0, "initialMotionValue":F
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 1177
a=0;//     .local v2, "lastMotionValue":F
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1180
a=0;//     #v5=(Reference,[I);
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_1
a=0;// 
a=0;//     .line 1187
a=0;//     sub-float v5, v0, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     div-float/2addr v5, v8
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1188
a=0;//     .local v3, "newScrollValue":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getHeaderSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1192
a=0;//     .local v1, "itemDimension":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setHeaderScroll(I)V
a=0;// 
a=0;//     .line 1194
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1195
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     int-to-float v6, v1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v4, v5, v6
a=0;// 
a=0;//     .line 1196
a=0;//     .local v4, "scale":F
a=0;//     #v4=(Float);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_2
a=0;// 
a=0;//     .line 1202
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->onPull(F)V
a=0;// 
a=0;//     .line 1206
a=0;//     :goto_2
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     sget-object v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     if-eq v5, v6, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v1, v5, :cond_1
a=0;// 
a=0;//     .line 1207
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     new-array v6, v9, [Z
a=0;// 
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 1212
a=0;//     .end local v4    # "scale":F
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1170
a=0;//     .end local v0    # "initialMotionValue":F
a=0;//     .end local v1    # "itemDimension":I
a=0;//     .end local v2    # "lastMotionValue":F
a=0;//     .end local v3    # "newScrollValue":I
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Integer);
a=0;//     iget v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionX:F
a=0;// 
a=0;//     .line 1171
a=0;//     .restart local v0    # "initialMotionValue":F
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     .line 1172
a=0;//     .restart local v2    # "lastMotionValue":F
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1182
a=0;//     :pswitch_1
a=0;//     sub-float v5, v0, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     div-float/2addr v5, v8
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1183
a=0;//     .restart local v3    # "newScrollValue":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getFooterSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1184
a=0;//     .restart local v1    # "itemDimension":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1198
a=0;//     .restart local v4    # "scale":F
a=0;//     :pswitch_2
a=0;//     #v4=(Float);v5=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->onPull(F)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1208
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sget-object v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->PULL_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_0
a=0;// 
a=0;//     .line 1209
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     new-array v6, v9, [Z
a=0;// 
a=0;//     invoke-virtual {p0, v5, v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1168
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1180
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1196
a=0;//     :pswitch_data_2
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private final smoothScrollTo(IJ)V
a=0;//     .locals 7
a=0;//     .param p1, "scrollValue"    # I
a=0;//     .param p2, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 1243
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-wide v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     .line 1244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private final smoothScrollTo(IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "newScrollValue"    # I
a=0;//     .param p2, "duration"    # J
a=0;//     .param p4, "delayMillis"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 1248
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p6, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1249
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->stop()V
a=0;// 
a=0;//     .line 1253
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1259
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1263
a=0;//     .local v2, "oldScrollValue":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, p1, :cond_2
a=0;// 
a=0;//     .line 1264
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollAnimationInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1266
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollAnimationInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 1268
a=0;//     :cond_1
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p2
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     .line 1270
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p4, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 1271
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     invoke-virtual {p0, v0, p4, p5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 1276
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1255
a=0;//     .end local v2    # "oldScrollValue":I
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1256
a=0;//     .restart local v2    # "oldScrollValue":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(LongHi);v3=(Integer);v4=(LongLo);v5=(LongHi);v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentSmoothScrollRunnable:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1253
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);p6=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private final smoothScrollToAndBack(I)V
a=0;//     .locals 7
a=0;//     .param p1, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1279
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const-wide/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;);
a=0;//     invoke-direct {v6, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$3;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     .line 1286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 4
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const-string v1, "PullToRefresh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "addView: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "refreshableView":Landroid/view/View;, "TT;"
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     instance-of v1, v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .end local v0    # "refreshableView":Landroid/view/View;, "TT;"
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 142
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     .restart local v0    # "refreshableView":Landroid/view/View;, "TT;"
a=0;//     :cond_0
a=0;//     new-instance v1, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v2, "Refreshable View is not a ViewGroup so can\'t addView"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method protected final addViewInternal(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 0
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 575
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final addViewInternal(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-super {p0, p1, v0, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 583
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 586
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLoadingAnimationStyle:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 587
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 586
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1, p1, p2, v2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 588
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 589
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected createLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;//     .locals 2
a=0;//     .param p1, "includeStart"    # Z
a=0;//     .param p2, "includeEnd"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;);
a=0;//     invoke-direct {v0}, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;-><init>()V
a=0;// 
a=0;//     .line 599
a=0;//     .local v0, "proxy":Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 600
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->addLayout(Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;)V
a=0;// 
a=0;//     .line 602
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 603
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0, v1}, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->addLayout(Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;)V
a=0;// 
a=0;//     .line 606
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Landroid/util/AttributeSet;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public final demo()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullStart()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getHeaderSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollToAndBack(I)V
a=0;// 
a=0;//     .line 153
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullEnd()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getFooterSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollToAndBack(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final disableLoadingLayoutVisibilityChanges()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 627
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getFilterTouchEvents()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected final getFooterLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 630
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final getFooterSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getContentSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected final getHeaderLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final getHeaderSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 642
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getContentSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getLoadingLayoutProxy()Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 168
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;//     .locals 1
a=0;//     .param p1, "includeStart"    # Z
a=0;//     .param p2, "includeEnd"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->createLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// .end method
a=0;// 
a=0;// .method protected getPullToRefreshScrollDuration()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected getPullToRefreshScrollDurationLonger()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 650
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/16 v0, 0x145
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getRefreshableView()Landroid/view/View;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getRefreshableViewWrapper()Landroid/widget/FrameLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getShowViewWhileRefreshing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getState()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected handleStyledAttributes(Landroid/content/res/TypedArray;)V
a=0;//     .locals 0
a=0;//     .param p1, "a"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 664
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final isDisableScrollingWhileRefreshing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isScrollingWhileRefreshingEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final isPullToRefreshEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->permitsPullToRefresh()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isPullToRefreshOverScrollEnabled()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->isAndroidOverScrollEnabled(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract isReadyForPullEnd()Z
a=0;// .end method
a=0;// 
a=0;// .method protected abstract isReadyForPullStart()Z
a=0;// .end method
a=0;// 
a=0;// .method public final isRefreshing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isScrollingWhileRefreshingEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 227
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isPullToRefreshEnabled()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Integer);
a=0;//     return v6
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(One);v8=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "action":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-eq v1, v8, :cond_1
a=0;// 
a=0;//     if-ne v1, v7, :cond_2
a=0;// 
a=0;//     .line 234
a=0;//     :cond_1
a=0;//     iput-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :cond_2
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v8, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 239
a=0;//     #v6=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 242
a=0;//     :cond_3
a=0;//     #v6=(Null);v8=(PosByte);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 298
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);
a=0;//     iget-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 245
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(One);v8=(PosByte);
a=0;//     iget-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 246
a=0;//     #v6=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :cond_5
a=0;//     #v6=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPull()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 250
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .local v5, "y":F
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 255
a=0;//     .local v4, "x":F
a=0;//     #v4=(Float);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v8}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget v6, v6, v8
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     packed-switch v6, :pswitch_data_1
a=0;// 
a=0;//     .line 262
a=0;//     iget v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     sub-float v2, v5, v6
a=0;// 
a=0;//     .line 263
a=0;//     .local v2, "diff":F
a=0;//     #v2=(Float);
a=0;//     iget v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     sub-float v3, v4, v6
a=0;// 
a=0;//     .line 266
a=0;//     .local v3, "oppositeDiff":F
a=0;//     :goto_2
a=0;//     #v3=(Float);
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "absDiff":F
a=0;//     #v0=(Float);
a=0;//     iget v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpl-float v6, v0, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_4
a=0;// 
a=0;//     iget-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpl-float v6, v0, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_4
a=0;// 
a=0;//     .line 269
a=0;//     :cond_6
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     cmpl-float v6, v2, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_7
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullStart()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 270
a=0;//     iput v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 271
a=0;//     iput v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     .line 272
a=0;//     iput-boolean v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sget-object v7, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v7=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-ne v6, v7, :cond_4
a=0;// 
a=0;//     .line 274
a=0;//     sget-object v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 257
a=0;//     .end local v0    # "absDiff":F
a=0;//     .end local v2    # "diff":F
a=0;//     .end local v3    # "oppositeDiff":F
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Integer);v7=(One);
a=0;//     iget v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     sub-float v2, v4, v6
a=0;// 
a=0;//     .line 258
a=0;//     .restart local v2    # "diff":F
a=0;//     #v2=(Float);
a=0;//     iget v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     sub-float v3, v5, v6
a=0;// 
a=0;//     .line 259
a=0;//     .restart local v3    # "oppositeDiff":F
a=0;//     #v3=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 276
a=0;//     .restart local v0    # "absDiff":F
a=0;//     :cond_7
a=0;//     #v0=(Float);v6=(Byte);
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     const/high16 v6, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     cmpg-float v6, v2, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPullEnd()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 277
a=0;//     iput v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 278
a=0;//     iput v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     .line 279
a=0;//     iput-boolean v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sget-object v7, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v7=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-ne v6, v7, :cond_4
a=0;// 
a=0;//     .line 281
a=0;//     sget-object v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 289
a=0;//     .end local v0    # "absDiff":F
a=0;//     .end local v2    # "diff":F
a=0;//     .end local v3    # "oppositeDiff":F
a=0;//     .end local v4    # "x":F
a=0;//     .end local v5    # "y":F
a=0;//     :pswitch_3
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(One);v8=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPull()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iput v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionY:F
a=0;// 
a=0;//     iput v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iput v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionX:F
a=0;// 
a=0;//     iput v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     .line 292
a=0;//     iput-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 242
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 255
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onPtrRestoreInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 691
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPtrSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "saveState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPullToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 707
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 718
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 709
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->pullToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 712
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->pullToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 707
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final onRefreshComplete()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRefreshing(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "doScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 728
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->refreshing()V
a=0;// 
a=0;//     .line 730
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 731
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->refreshing()V
a=0;// 
a=0;//     .line 734
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 735
a=0;//     iget-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 738
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$1;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     .line 745
a=0;//     .local v0, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$1;);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 752
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getHeaderSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(ILcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     .line 762
a=0;//     .end local v0    # "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 748
a=0;//     .restart local v0    # "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     :pswitch_1
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$1;);v1=(Integer);v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getFooterSize()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(ILcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 756
a=0;//     .end local v0    # "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 760
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->callRefreshListener()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 745
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onReleaseToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 769
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 780
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 771
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->releaseToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 774
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->releaseToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 769
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onReset()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 787
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 788
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->reset()V
a=0;// 
a=0;//     .line 792
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->reset()V
a=0;// 
a=0;//     .line 794
a=0;//     invoke-virtual {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(I)V
a=0;// 
a=0;//     .line 795
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 5
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 799
a=0;//     #v3=(Null);
a=0;//     instance-of v2, p1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 800
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 802
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     const-string v2, "ptr_mode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {p0, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setMode(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 803
a=0;//     const-string v2, "ptr_current_mode"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 805
a=0;//     const-string v2, "ptr_disable_scrolling"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 806
a=0;//     const-string v2, "ptr_show_refreshing_view"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 809
a=0;//     const-string v2, "ptr_super"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-super {p0, v2}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 811
a=0;//     const-string v2, "ptr_state"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 812
a=0;//     .local v1, "viewState":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;"
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 813
a=0;//     :cond_0
a=0;//     new-array v2, v4, [Z
a=0;// 
a=0;//     aput-boolean v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 817
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPtrRestoreInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 822
a=0;//     .end local v0    # "bundle":Landroid/os/Bundle;
a=0;//     .end local v1    # "viewState":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 821
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 826
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 830
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPtrSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 832
a=0;//     const-string v1, "ptr_state"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 833
a=0;//     const-string v1, "ptr_mode"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 834
a=0;//     const-string v1, "ptr_current_mode"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getIntValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 835
a=0;//     const-string v1, "ptr_disable_scrolling"
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 836
a=0;//     const-string v1, "ptr_show_refreshing_view"
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 837
a=0;//     const-string v1, "ptr_super"
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 839
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final onSizeChanged(IIII)V
a=0;//     .locals 5
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const-string v0, "PullToRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "onSizeChanged. W: %d, H: %d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 848
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 851
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->refreshLoadingViewsSize()V
a=0;// 
a=0;//     .line 854
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->refreshRefreshableViewSize(II)V
a=0;// 
a=0;//     .line 860
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$2;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$2;);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 866
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 311
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isPullToRefreshEnabled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 371
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 316
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 317
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 320
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 324
a=0;//     :cond_3
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 336
a=0;//     :pswitch_0
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isReadyForPull()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionY:F
a=0;// 
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 338
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mInitialMotionX:F
a=0;// 
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 339
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 326
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionY:F
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLastMotionX:F
a=0;// 
a=0;//     .line 329
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->pullEvent()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 330
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 346
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RELEASE_TO_REFRESH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     if-ne v2, v3, :cond_5
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 351
a=0;//     :cond_4
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     new-array v3, v1, [Z
a=0;// 
a=0;//     aput-boolean v1, v3, v0
a=0;// 
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 352
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     :cond_5
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(I)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 358
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_6
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->RESET:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     new-array v0, v0, [Z
a=0;// 
a=0;//     #v0=(Reference,[Z);
a=0;//     invoke-virtual {p0, v2, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 365
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 324
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final refreshLoadingViewsSize()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 873
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getMaximumPullScroll()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const v6, 0x3f99999a    # 1.2f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     float-to-int v0, v5
a=0;// 
a=0;//     .line 875
a=0;//     .local v0, "maximumPullScroll":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 876
a=0;//     .local v2, "pLeft":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 877
a=0;//     .local v4, "pTop":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 878
a=0;//     .local v3, "pRight":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 880
a=0;//     .local v1, "pBottom":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 915
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "PullToRefresh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Setting Padding. L: %d, T: %d, R: %d, B: %d"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 917
a=0;//     invoke-virtual {p0, v2, v4, v3, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setPadding(IIII)V
a=0;// 
a=0;//     .line 918
a=0;//     return-void
a=0;// 
a=0;//     .line 882
a=0;//     :pswitch_0
a=0;//     #v5=(Integer);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 883
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setWidth(I)V
a=0;// 
a=0;//     .line 884
a=0;//     neg-int v2, v0
a=0;// 
a=0;//     .line 889
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 890
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setWidth(I)V
a=0;// 
a=0;//     .line 891
a=0;//     neg-int v3, v0
a=0;// 
a=0;//     .line 892
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 886
a=0;//     :cond_0
a=0;//     #v5=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 893
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 895
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 898
a=0;//     :pswitch_1
a=0;//     #v3=(Integer);v5=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 899
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setHeight(I)V
a=0;// 
a=0;//     .line 900
a=0;//     neg-int v4, v0
a=0;// 
a=0;//     .line 905
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 906
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v5, v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setHeight(I)V
a=0;// 
a=0;//     .line 907
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     .line 908
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 902
a=0;//     :cond_2
a=0;//     #v5=(Boolean);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 909
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 880
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final refreshRefreshableViewSize(II)V
a=0;//     .locals 3
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 923
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 925
a=0;//     .local v0, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 939
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 927
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);
a=0;//     iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I
a=0;// 
a=0;//     if-eq v1, p1, :cond_0
a=0;// 
a=0;//     .line 928
a=0;//     iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I
a=0;// 
a=0;//     .line 929
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/FrameLayout;->requestLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 933
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);
a=0;//     iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I
a=0;// 
a=0;//     if-eq v1, p2, :cond_0
a=0;// 
a=0;//     .line 934
a=0;//     iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I
a=0;// 
a=0;//     .line 935
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mRefreshableViewWrapper:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/FrameLayout;->requestLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 925
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setDisableScrollingWhileRefreshing(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "disableScrollingWhileRefreshing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setScrollingWhileRefreshingEnabled(Z)V
a=0;// 
a=0;//     .line 383
a=0;//     return-void
a=0;// 
a=0;//     .line 382
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setFilterTouchEvents(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "filterEvents"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFilterTouchEvents:Z
a=0;// 
a=0;//     .line 388
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final setHeaderScroll(I)V
a=0;//     .locals 6
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 949
a=0;//     #v4=(Null);
a=0;//     const-string v1, "PullToRefresh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "setHeaderScroll: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 953
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getMaximumPullScroll()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 954
a=0;//     .local v0, "maximumPullScroll":I
a=0;//     #v0=(Integer);
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 956
a=0;//     iget-boolean v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mLayoutVisibilityChangesEnabled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 957
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     .line 958
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1, v4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 977
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 985
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 959
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     if-lez p1, :cond_2
a=0;// 
a=0;//     .line 960
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1, v4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 962
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 963
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 979
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     invoke-virtual {p0, v4, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 982
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p0, p1, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 977
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setLastUpdatedLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy()Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setLastUpdatedLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 396
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy()Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 404
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLoadingDrawable(Landroid/graphics/drawable/Drawable;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 413
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLongClickable(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "longClickable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->setLongClickable(Z)V
a=0;// 
a=0;//     .line 418
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setMode(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p1, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     const-string v0, "PullToRefresh"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Setting mode to: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 426
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 427
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->updateUIForMode()V
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPullEventListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p1, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener<TT;>;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnPullEventListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;
a=0;// 
a=0;//     .line 433
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p1, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2<TT;>;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     .line 444
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     .line 445
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setOnRefreshListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p1, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener<TT;>;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener;
a=0;// 
a=0;//     .line 438
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnRefreshListener2:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnRefreshListener2;
a=0;// 
a=0;//     .line 439
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPullLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "pullLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy()Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setPullLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPullLabel(Ljava/lang/CharSequence;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "pullLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setPullLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 461
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setPullToRefreshEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setMode(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 470
a=0;//     return-void
a=0;// 
a=0;//     .line 469
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final setPullToRefreshOverScrollEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOverScrollEnabled:Z
a=0;// 
a=0;//     .line 475
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setRefreshing()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setRefreshing(Z)V
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setRefreshing(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "doScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-boolean p1, v1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;// 
a=0;//     .line 487
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "refreshingLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 494
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy()Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 495
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshingLabel(Ljava/lang/CharSequence;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "refreshingLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 504
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setReleaseLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "releaseLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setReleaseLabel(Ljava/lang/CharSequence;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setReleaseLabel(Ljava/lang/CharSequence;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 2
a=0;//     .param p1, "releaseLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/ILoadingLayout;);
a=0;//     invoke-interface {v0, p1}, Lcom/handmark/pulltorefresh/library/ILoadingLayout;->setReleaseLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 521
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScrollAnimationInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 0
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 524
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollAnimationInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 525
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setScrollingWhileRefreshingEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "allowScrollingWhileRefreshing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mScrollingWhileRefreshingEnabled:Z
a=0;// 
a=0;//     .line 376
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setShowViewWhileRefreshing(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "showView"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mShowViewWhileRefreshing:Z
a=0;// 
a=0;//     .line 530
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final varargs setState(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;[Z)V
a=0;//     .locals 3
a=0;//     .param p2, "params"    # [Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p1, "state":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     .line 541
a=0;//     const-string v0, "PullToRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "State: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 544
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$State()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 564
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnPullEventListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 565
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mOnPullEventListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mState:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-interface {v0, p0, v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnPullEventListener;->onPullEvent(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 567
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 546
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReset()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 549
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPullToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 552
a=0;//     :pswitch_2
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReleaseToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :pswitch_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-boolean v0, p2, v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onRefreshing(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 544
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final smoothScrollTo(I)V
a=0;//     .locals 2
a=0;//     .param p1, "scrollValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 994
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJ)V
a=0;// 
a=0;//     .line 995
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final smoothScrollTo(ILcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "scrollValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1005
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     .local p2, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v6, p2
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;// 
a=0;//     .line 1006
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final smoothScrollToLonger(I)V
a=0;//     .locals 2
a=0;//     .param p1, "scrollValue"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1015
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getPullToRefreshScrollDurationLonger()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->smoothScrollTo(IJ)V
a=0;// 
a=0;//     .line 1016
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected updateUIForMode()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1025
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->getLoadingLayoutLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1028
a=0;//     .local v0, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne p0, v1, :cond_0
a=0;// 
a=0;//     .line 1029
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1031
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1032
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mHeaderLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v1, v2, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->addViewInternal(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1036
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne p0, v1, :cond_2
a=0;// 
a=0;//     .line 1037
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1039
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1040
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mFooterLayout:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->addViewInternal(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1044
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->refreshLoadingViewsSize()V
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eq v1, v2, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->mCurrentMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 1049
a=0;//     return-void
a=0;// 
a=0;//     .line 1048
a=0;//     :cond_4
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
