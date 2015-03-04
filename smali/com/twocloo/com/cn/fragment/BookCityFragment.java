package com.twocloo.com.cn.fragment; class BookCityFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "BookCityFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;,
a=0;//         Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnClickListener;,
a=0;//         Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static hasExit:Z
a=0;// 
a=0;// .field public static isCache:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bottomLineWidth:I
a=0;// 
a=0;// .field private cache:Z
a=0;// 
a=0;// .field private currIndex:I
a=0;// 
a=0;// .field private hasLoad:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private ivBottomLine:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private final mPageName:Ljava/lang/String;
a=0;// 
a=0;// .field private mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// .field private mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private maps:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private network_unvaliable_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field pagerAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private position:[I
a=0;// 
a=0;// .field private textViews:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/widget/TextView;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected timer:Ljava/util/Timer;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private webViewCache:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Lcom/twocloo/com/cn/view/PullRefreshWebView;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->isCache:Z
a=0;// 
a=0;//     .line 69
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasExit:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->cache:Z
a=0;// 
a=0;//     .line 74
a=0;//     const-string v0, "BookCityFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 257
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->pagerAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private InitTextView()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->citybook_network_unvaliable:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->network_unvaliable_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->textViews:Ljava/util/List;
a=0;// 
a=0;//     .line 224
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasLoad:Ljava/util/List;
a=0;// 
a=0;//     .line 225
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v1, v2, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->tv_tab_one:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v1, v5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_two:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_three:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_four:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_five:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_six:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     .line 226
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_seven:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->tv_tab_eight:I
a=0;// 
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     .line 227
a=0;//     .local v1, "ids":[I
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->vPager:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 228
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->network_unvaliable_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/BookCityFragment$3;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$3;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$3;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$3;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 242
a=0;//     return-void
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->textViews:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     aget v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->textViews:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->textViews:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "_"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aget-object v3, v3, v5
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->textViews:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnClickListener;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnClickListener;);
a=0;//     invoke-direct {v3, p0, v0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnClickListener;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnClickListener;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasLoad:Ljava/util/List;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 228
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private InitViewPager()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->webViewCache:Ljava/util/Map;
a=0;// 
a=0;//     .line 246
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->pagerAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     .line 252
a=0;//     .local v1, "myOnPageChangeListener":Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 253
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 254
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->load()V
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// 
a=0;//     .line 247
a=0;//     .end local v1    # "myOnPageChangeListener":Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->webViewCache:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->initWebView()Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/PullRefreshWebView;);
a=0;//     invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 246
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private InitWidth()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->iv_bottom_line:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->ivBottomLine:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->ivBottomLine:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->ivBottomLine:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->bottomLineWidth:I
a=0;// 
a=0;//     .line 307
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 308
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 309
a=0;//     iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     .line 310
a=0;//     .local v4, "screenW":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int v5, v4, v5
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->bottomLineWidth:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     div-int/lit8 v2, v5, 0x2
a=0;// 
a=0;//     .line 311
a=0;//     .local v2, "offset1":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int v3, v4, v5
a=0;// 
a=0;//     .line 312
a=0;//     .local v3, "position_one":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-array v5, v5, [I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->position:[I
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v1, v5, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     return-void
a=0;// 
a=0;//     .line 314
a=0;//     :cond_0
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->position:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     mul-int v6, v3, v1
a=0;// 
a=0;//     add-int/2addr v6, v2
a=0;// 
a=0;//     aput v6, v5, v1
a=0;// 
a=0;//     .line 313
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->webViewCache:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/BookCityFragment;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/fragment/BookCityFragment;)[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->position:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/fragment/BookCityFragment;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/fragment/BookCityFragment;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->ivBottomLine:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->network_unvaliable_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasLoad:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/fragment/BookCityFragment;Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/fragment/BookCityFragment;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->cache:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->InitTextView()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->InitWidth()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->InitViewPager()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/support/v4/view/ViewPager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initWebView()Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     new-instance v0, Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/view/PullRefreshWebView;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v0, v2}, Lcom/twocloo/com/cn/view/PullRefreshWebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v0, "pwv":Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/PullRefreshWebView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/PullRefreshWebView;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 201
a=0;//     .local v1, "wv":Lcom/twocloo/com/cn/beans/WebView;
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->setProgressDialog(Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "twocloo"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/BookCityFragment$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$2;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$2;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/WebView;->setonReceiveErrorCallBack(Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 212
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getmWebView()Lcom/twocloo/com/cn/beans/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public load()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->network_unvaliable_layout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->webViewCache:Ljava/util/Map;
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/view/PullRefreshWebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PullRefreshWebView;->getRefreshableView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasLoad:Ljava/util/List;
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->maps:Ljava/util/HashMap;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "_"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 366
a=0;//     .local v0, "url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mWebView:Lcom/twocloo/com/cn/beans/WebView;
a=0;// 
a=0;//     iget-boolean v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->cache:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/twocloo/com/cn/beans/WebView;->loadUrl(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasLoad:Ljava/util/List;
a=0;// 
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->currIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v1, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 369
a=0;//     .end local v0    # "url":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public makeToast(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;-><init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;//     .param p1, "transit"    # I
a=0;//     .param p2, "enter"    # Z
a=0;//     .param p3, "nextAnim"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateAnimation(IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->book_city_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V
a=0;// 
a=0;//     .line 105
a=0;//     const-string v0, "BookCityFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 95
a=0;//     const-string v0, "BookCityFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->mainLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMainTopBackGrundLayout(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
}}
