package com.actionbarsherlock.internal.widget; class ScrollingTabContainerView { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;,
a=0;//         Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;,
a=0;//         Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;,
a=0;//         Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;",
a=0;//         "Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final FADE_DURATION:I = 0xc8
a=0;// 
a=0;// .field private static final sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllowCollapse:Z
a=0;// 
a=0;// .field private mContentHeight:I
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field mMaxTabWidth:I
a=0;// 
a=0;// .field private mSelectedTabIndex:I
a=0;// 
a=0;// .field private mTabClickListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;// .field private mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;// .field mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;// .field protected final mVisAnimListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;// .field protected mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;);
a=0;//     invoke-direct {v1, p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;-><init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p0, v5}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcom/actionbarsherlock/R$styleable;->SherlockActionBar:[I
a=0;// 
a=0;//     .line 73
a=0;//     #v3=(Reference,[I);
a=0;//     sget v4, Lcom/actionbarsherlock/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     .line 72
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->createTabLayout()Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 81
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 80
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->createTabView(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createSpinner()Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     sget v3, Lcom/actionbarsherlock/R$attr;->actionDropDownStyle:I
a=0;// 
a=0;//     .line 198
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v0, "spinner":Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 201
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 200
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setOnItemSelectedListener(Lcom/actionbarsherlock/internal/widget/IcsAdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 203
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createTabLayout()Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 190
a=0;//     sget v2, Lcom/actionbarsherlock/R$layout;->abs__action_bar_tab_bar_view:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 189
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     .line 191
a=0;//     .local v0, "tabLayout":Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setMeasureWithLargestChildEnabled(Z)V
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 193
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 192
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 194
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createTabView(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     .locals 4
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "forAdapter"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v2, Lcom/actionbarsherlock/R$layout;->abs__action_bar_tab:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     .line 277
a=0;//     .local v0, "tabView":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     invoke-virtual {v0, p0, p1, p2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->init(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 281
a=0;//     new-instance v1, Landroid/widget/AbsListView$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 282
a=0;//     #v2=(Byte);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 281
a=0;//     #v1=(Reference,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 291
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabClickListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 287
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     invoke-direct {v1, p0, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;-><init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabClickListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     .line 289
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabClickListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isCollapsed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private performCollapse()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->createSpinner()Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     .line 147
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     .line 149
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 148
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     invoke-direct {v1, p0, v4}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;-><init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 155
a=0;//     iput-object v4, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 157
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->setSelection(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private performExpand()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 161
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsSpinner;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     .line 165
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 164
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 310
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1, v5}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->createTabView(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "tabView":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 312
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 311
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v0, p2, v2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V
a=0;// 
a=0;//     .line 319
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 322
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;//     .param p2, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1, v5}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->createTabView(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 296
a=0;//     .local v0, "tabView":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 297
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 296
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V
a=0;// 
a=0;//     .line 304
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 305
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 307
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public animateToTab(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 244
a=0;//     .local v0, "tabView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$1;-><init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Landroid/view/View;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$1;);
a=0;//     iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public animateToVisibility(I)V
a=0;//     .locals 7
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 219
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->cancel()V
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setAlpha(F)V
a=0;// 
a=0;//     .line 226
a=0;//     :cond_1
a=0;//     const-string v1, "alpha"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aput v3, v2, v4
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 227
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 228
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->start()V
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 233
a=0;//     .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(One);v3=(Null);
a=0;//     const-string v1, "alpha"
a=0;// 
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     aput v3, v2, v4
a=0;// 
a=0;//     invoke-static {p0, v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 234
a=0;//     .restart local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 235
a=0;//     sget-object v1, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->sAlphaInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisAnimListener:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 6
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 208
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcom/actionbarsherlock/R$styleable;->SherlockActionBar:[I
a=0;// 
a=0;//     .line 213
a=0;//     #v3=(Reference,[I);
a=0;//     sget v4, Lcom/actionbarsherlock/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     .line 212
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemSelected(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 2
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/actionbarsherlock/internal/widget/IcsAdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 356
a=0;//     .local p1, "parent":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<*>;"
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     .line 357
a=0;//     .local v0, "tabView":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->getTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->select()V
a=0;// 
a=0;//     .line 358
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 11
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v10, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v7=(Null);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 87
a=0;//     .local v5, "widthMode":I
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v10, :cond_2
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 88
a=0;//     .local v2, "lockedExpanded":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setFillViewport(Z)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v8}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v6, :cond_4
a=0;// 
a=0;//     .line 92
a=0;//     if-eq v5, v10, :cond_0
a=0;// 
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v5, v8, :cond_4
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-le v1, v8, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     const v9, 0x3ecccccd    # 0.4f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     mul-float/2addr v8, v9
a=0;// 
a=0;//     float-to-int v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iput v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     .line 102
a=0;//     :goto_1
a=0;//     #v9=(Conflicted);
a=0;//     iget v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     .line 104
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     iget-boolean v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "canCollapse":Z
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v8=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v6, v7, p2}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->measure(II)V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v6, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v6, v7, :cond_6
a=0;// 
a=0;//     .line 110
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->performCollapse()V
a=0;// 
a=0;//     .line 118
a=0;//     :goto_3
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 119
a=0;//     .local v4, "oldWidth":I
a=0;//     #v4=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineHorizontalScrollView;->onMeasure(II)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 122
a=0;//     .local v3, "newWidth":I
a=0;//     #v3=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eq v4, v3, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     iget v6, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "canCollapse":Z
a=0;//     .end local v1    # "childCount":I
a=0;//     .end local v2    # "lockedExpanded":Z
a=0;//     .end local v3    # "newWidth":I
a=0;//     .end local v4    # "oldWidth":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 87
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     .restart local v1    # "childCount":I
a=0;//     .restart local v2    # "lockedExpanded":Z
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Boolean);v8=(PosByte);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     iput v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 99
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     iput v8, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Integer);v9=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v0    # "canCollapse":Z
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v6=(Integer);v7=(Integer);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->performExpand()Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 115
a=0;//     :cond_7
a=0;//     #v6=(One);v7=(Null);
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->performExpand()Z
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public onNothingSelected(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/actionbarsherlock/internal/widget/IcsAdapterView",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     .local p1, "parent":Lcom/actionbarsherlock/internal/widget/IcsAdapterView;, "Lcom/actionbarsherlock/internal/widget/IcsAdapterView<*>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAllTabs()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 349
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 352
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTabAt(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->removeViewAt(I)V
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAllowCollapse(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "allowCollapse"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iput-boolean p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabSelected(I)V
a=0;//     .locals 5
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 173
a=0;//     .local v3, "tabCount":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, p1, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 176
a=0;//     .local v2, "isSelected":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     .end local v2    # "isSelected":Z
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public updateTab(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabLayout:Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->update()V
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mTabSpinner:Lcom/actionbarsherlock/internal/widget/IcsSpinner;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 329
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 332
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
