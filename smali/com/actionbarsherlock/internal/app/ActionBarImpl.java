package com.actionbarsherlock.internal.app; class ActionBarImpl { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/app/ActionBarImpl;
a=0;// .super Lcom/actionbarsherlock/app/ActionBar;
a=0;// .source "ActionBarImpl.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;,
a=0;//         Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONTEXT_DISPLAY_NORMAL:I = 0x0
a=0;// 
a=0;// .field private static final CONTEXT_DISPLAY_SPLIT:I = 0x1
a=0;// 
a=0;// .field private static final INVALID_POSITION:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;// 
a=0;// .field private mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field private mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field private mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mContextDisplayMode:I
a=0;// 
a=0;// .field private mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;// .field private mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;// .field private mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;// .field mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;// .field mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;// .field final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHasEmbeddedTabs:Z
a=0;// 
a=0;// .field final mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// .field private mLastMenuVisibility:Z
a=0;// 
a=0;// .field private mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mSavedTabPosition:I
a=0;// 
a=0;// .field private mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;// .field private mShowHideAnimationEnabled:Z
a=0;// 
a=0;// .field final mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// .field private mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field private mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// .field mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTabs:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mThemedContext:Landroid/content/Context;
a=0;// 
a=0;// .field mWasHiddenBeforeMode:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;I)V
a=0;//     .locals 3
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "features"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/app/ActionBar;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v2, Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v2}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;);
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 136
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 138
a=0;//     .local v1, "window":Landroid/view/Window;
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "decor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->init(Landroid/view/View;)V
a=0;// 
a=0;//     .line 142
a=0;//     and-int/lit16 v2, p2, 0x200
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     const v2, 0x1020002
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Dialog;)V
a=0;//     .locals 1
a=0;//     .param p1, "dialog"    # Landroid/app/Dialog;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/app/ActionBar;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->init(Landroid/view/View;)V
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/actionbarsherlock/internal/app/ActionBarImpl;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private cleanupTabs()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeAllTabs()V
a=0;// 
a=0;//     .line 340
a=0;//     :cond_1
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/app/ActionBar$Tab;);
a=0;//     check-cast v3, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     .line 421
a=0;//     .local v3, "tabi":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 423
a=0;//     .local v0, "callback":Lcom/actionbarsherlock/app/ActionBar$TabListener;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/app/ActionBar$TabListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Action Bar Tab must have a Callback"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {v3, p2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 431
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, p2, 0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, v1, :cond_1
a=0;// 
a=0;//     .line 434
a=0;//     return-void
a=0;// 
a=0;//     .line 432
a=0;//     :cond_1
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 431
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ensureTabsExist()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 210
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);v3=(Uninit);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "tabScroller":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 224
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "decor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 153
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 154
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 156
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__action_context_bar:I
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 158
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__action_bar_container:I
a=0;// 
a=0;//     .line 157
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/actionbarsherlock/R$id;->abs__split_action_bar:I
a=0;// 
a=0;//     .line 159
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " can only be used "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 164
a=0;//     const-string v2, "with a compatible window decor layout"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 163
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setContextView(Lcom/actionbarsherlock/internal/widget/ActionBarContextView;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isSplitActionBar()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v0, v3, :cond_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHomeButtonEnabled(Z)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 176
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHasEmbeddedTabs(Z)V
a=0;// 
a=0;//     .line 177
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 169
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v3=(PosByte);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 173
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private setHasEmbeddedTabs(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "hasEmbeddedTabs"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     #v2=(Null);
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     .line 195
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 202
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "isInTabMode":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v4, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     iget-boolean v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCollapsable(Z)V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// 
a=0;//     .line 199
a=0;//     .end local v0    # "isInTabMode":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Boolean);v4=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 202
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 204
a=0;//     .restart local v0    # "isInTabMode":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);v4=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);v4=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 206
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addOnMenuVisibilityListener(Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 439
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V
a=0;// 
a=0;//     .line 444
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V
a=0;// 
a=0;//     .line 459
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V
a=0;// 
a=0;//     .line 460
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
a=0;// 
a=0;//     .line 461
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 464
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 450
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
a=0;// 
a=0;//     .line 451
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 452
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 454
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method animateToMode(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "toActionMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 622
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 623
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->show(Z)V
a=0;// 
a=0;//     .line 625
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 626
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 629
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->animateToVisibility(I)V
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->animateToVisibility(I)V
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hasEmbeddedTabs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 632
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->animateToVisibility(I)V
a=0;// 
a=0;//     .line 634
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 629
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 630
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 632
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method completeDeferredDestroyActionMode()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/view/ActionMode;);
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 230
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     .line 231
a=0;//     iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchMenuVisibilityChanged(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "isVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mLastMenuVisibility:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mLastMenuVisibility:Z
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 264
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;->onMenuVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 264
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getCustomNavigationView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplayOptions()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getNavigationItemCount()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 961
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 968
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 963
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 965
a=0;//     :pswitch_1
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDropdownAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 966
a=0;//     .local v0, "adapter":Landroid/widget/SpinnerAdapter;
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 961
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getNavigationMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedNavigationIndex()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 949
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 955
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 951
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 953
a=0;//     :pswitch_1
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDropdownSelectedPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 949
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getSubtitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabAt(I)Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1003
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getThemedContext()Landroid/content/Context;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 638
a=0;//     new-instance v1, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 639
a=0;//     .local v1, "outValue":Landroid/util/TypedValue;
a=0;//     #v1=(Reference,Landroid/util/TypedValue;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 640
a=0;//     .local v0, "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);
a=0;//     sget v3, Lcom/actionbarsherlock/R$attr;->actionBarWidgetTheme:I
a=0;// 
a=0;//     .line 641
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 640
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 642
a=0;//     iget v2, v1, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     .line 644
a=0;//     .local v2, "targetThemeRes":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 645
a=0;//     new-instance v3, Landroid/view/ContextThemeWrapper;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/ContextThemeWrapper;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ContextThemeWrapper;);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 650
a=0;//     .end local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     .end local v1    # "outValue":Landroid/util/TypedValue;
a=0;//     .end local v2    # "targetThemeRes":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 647
a=0;//     .restart local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     .restart local v1    # "outValue":Landroid/util/TypedValue;
a=0;//     .restart local v2    # "targetThemeRes":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);v1=(Reference,Landroid/util/TypedValue;);v2=(Integer);v3=(Integer);v4=(One);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hide()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 587
a=0;//     #v6=(One);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 590
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 615
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 594
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(PosByte);v4=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 595
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTransitioning(Z)V
a=0;// 
a=0;//     .line 597
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 598
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v6, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aput v8, v4, v7
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 599
a=0;//     .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 600
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     const-string v3, "translationY"
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [F
a=0;// 
a=0;//     .line 601
a=0;//     #v4=(Reference,[F);
a=0;//     aput v8, v4, v7
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     aput v5, v4, v6
a=0;// 
a=0;//     .line 600
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "translationY"
a=0;// 
a=0;//     new-array v4, v6, [F
a=0;// 
a=0;//     .line 603
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     aput v5, v4, v7
a=0;// 
a=0;//     .line 602
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 605
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 606
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     new-array v4, v6, [F
a=0;// 
a=0;//     aput v8, v4, v7
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 609
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;);
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 610
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 611
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 613
a=0;//     .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     .end local v1    # "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(PosByte);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 618
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
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
a=0;// .method public newTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sget v1, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I
a=0;// 
a=0;//     .line 180
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHasEmbeddedTabs(Z)V
a=0;// 
a=0;//     .line 184
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAllTabs()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->cleanupTabs()V
a=0;// 
a=0;//     .line 330
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeOnMenuVisibilityListener(Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->removeTabAt(I)V
a=0;// 
a=0;//     .line 474
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTabAt(I)V
a=0;//     .locals 7
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 478
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 499
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 483
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 484
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getPosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 485
a=0;//     .local v3, "selectedTabPosition":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeTabAt(I)V
a=0;// 
a=0;//     .line 486
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     .line 487
a=0;//     .local v2, "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 488
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 491
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 492
a=0;//     .local v1, "newTabCount":I
a=0;//     #v1=(Integer);
a=0;//     move v0, p1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v1, :cond_4
a=0;// 
a=0;//     .line 496
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 497
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 484
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "newTabCount":I
a=0;//     .end local v2    # "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;//     .end local v3    # "selectedTabPosition":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 493
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "newTabCount":I
a=0;//     .restart local v2    # "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;//     .restart local v3    # "selectedTabPosition":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 492
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 497
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     add-int/lit8 v6, p1, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;//     .locals 4
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 503
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v1, v3, :cond_2
a=0;// 
a=0;//     .line 504
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 533
a=0;//     .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .restart local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Byte);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 504
a=0;//     #v1=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 509
a=0;//     .local v0, "trans":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     instance-of v1, v1, Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 510
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v1, Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 511
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 514
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     if-ne v1, p1, :cond_5
a=0;// 
a=0;//     .line 515
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 516
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabReselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
a=0;// 
a=0;//     .line 530
a=0;//     .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 531
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 520
a=0;//     .restart local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     :cond_5
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);v2=(Byte);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     .line 521
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabUnselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 524
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);
a=0;//     check-cast p1, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     .line 525
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 526
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabSelected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 361
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(I)V
a=0;//     .locals 3
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setCustomView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 932
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 933
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;Lcom/actionbarsherlock/app/ActionBar$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "layoutParams"    # Lcom/actionbarsherlock/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 937
a=0;//     invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 938
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 939
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayHomeAsUpEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showHomeAsUp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 286
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 287
a=0;//     return-void
a=0;// 
a=0;//     .line 286
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayOptions(I)V
a=0;//     .locals 1
a=0;//     .param p1, "options"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayOptions(II)V
a=0;//     .locals 4
a=0;//     .param p1, "options"    # I
a=0;//     .param p2, "mask"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 356
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 357
a=0;//     .local v0, "current":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     and-int v2, p1, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     xor-int/lit8 v3, p2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, v0
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 358
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowCustomEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showCustom"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     .line 296
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowHomeEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showHome"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 281
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 282
a=0;//     return-void
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowTitleEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showTitle"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayUseLogoEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "useLogo"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 276
a=0;//     #v1=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 277
a=0;//     return-void
a=0;// 
a=0;//     .line 276
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setHomeButtonEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V
a=0;// 
a=0;//     .line 302
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1009
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setIcon(I)V
a=0;// 
a=0;//     .line 1010
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1014
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1015
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;//     .param p2, "callback"    # Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 943
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 944
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCallback(Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;)V
a=0;// 
a=0;//     .line 945
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1019
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setLogo(I)V
a=0;// 
a=0;//     .line 1020
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "logo"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1024
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1025
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNavigationMode(I)V
a=0;//     .locals 5
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 979
a=0;//     #v4=(Byte);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 980
a=0;//     .local v0, "oldMode":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 987
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setNavigationMode(I)V
a=0;// 
a=0;//     .line 988
a=0;//     packed-switch p1, :pswitch_data_1
a=0;// 
a=0;//     .line 998
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(PosByte);
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCollapsable(Z)V
a=0;// 
a=0;//     .line 999
a=0;//     return-void
a=0;// 
a=0;//     .line 982
a=0;//     :pswitch_0
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getSelectedNavigationIndex()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 983
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 984
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 990
a=0;//     :pswitch_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V
a=0;// 
a=0;//     .line 991
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 992
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v4, :cond_0
a=0;// 
a=0;//     .line 993
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setSelectedNavigationItem(I)V
a=0;// 
a=0;//     .line 994
a=0;//     iput v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 980
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 988
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setSelectedNavigationItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     .line 324
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "setSelectedNavigationIndex not valid for current navigation mode"
a=0;// 
a=0;//     .line 323
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 317
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 326
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 320
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDropdownSelectedPosition(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setShowHideAnimationEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z
a=0;// 
a=0;//     .line 244
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setSplitBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 372
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setStackedBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 366
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 349
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 345
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->show(Z)V
a=0;// 
a=0;//     .line 548
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method show(Z)V
a=0;//     .locals 10
a=0;//     .param p1, "markHiddenBeforeMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 551
a=0;//     #v6=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 552
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     .line 554
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 555
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iput-boolean v6, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 558
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 560
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V
a=0;// 
a=0;//     .line 562
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 563
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aput v9, v4, v6
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 564
a=0;//     .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 565
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
a=0;// 
a=0;//     const-string v3, "translationY"
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [F
a=0;// 
a=0;//     .line 566
a=0;//     #v4=(Reference,[F);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     aput v5, v4, v6
a=0;// 
a=0;//     aput v7, v4, v8
a=0;// 
a=0;//     .line 565
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 567
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     neg-int v3, v3
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTranslationY(F)V
a=0;// 
a=0;//     .line 568
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "translationY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v8, [F
a=0;// 
a=0;//     aput v7, v4, v6
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 570
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v8, :cond_4
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 573
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     const-string v3, "alpha"
a=0;// 
a=0;//     new-array v4, v8, [F
a=0;// 
a=0;//     aput v9, v4, v6
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 575
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;);
a=0;//     invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 576
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 577
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 579
a=0;//     .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     .end local v1    # "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTranslationY(F)V
a=0;// 
a=0;//     .line 581
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startActionMode(Lcom/actionbarsherlock/view/ActionMode$Callback;)Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .locals 5
a=0;//     .param p1, "callback"    # Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 395
a=0;//     #v4=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 396
a=0;//     .local v1, "wasHidden":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z
a=0;// 
a=0;//     .line 398
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->finish()V
a=0;// 
a=0;//     .line 401
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     .line 402
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;Lcom/actionbarsherlock/view/ActionMode$Callback;)V
a=0;// 
a=0;//     .line 403
a=0;//     .local v0, "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->dispatchOnCreate()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 404
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->invalidate()V
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v2, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->initForMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->animateToMode(Z)V
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v4, :cond_1
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 412
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 413
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;// 
a=0;//     .line 416
a=0;//     .end local v0    # "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Null);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 404
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 416
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
