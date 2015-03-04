package com.twocloo.com.cn.activitys; class GuideActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/GuideActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "GuideActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final pics:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private lastX:I
a=0;// 
a=0;// .field private tag:Ljava/lang/String;
a=0;// 
a=0;// .field private viewPager:Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// 
a=0;// .field private views:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private vpAdapter:Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/activitys/GuideActivity;->pics:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/GuideActivity;);
a=0;//     const-string v0, "GuideActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private GoToMainActivity()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->finish()V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/GuideActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->goToApp()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private goToApp()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const-string v0, "PersonCenterFragment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->goback()V
a=0;// 
a=0;//     .line 119
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->GoToMainActivity()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private goback()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->finish()V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->goToApp()V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0x8
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 46
a=0;//     #v5=(Byte);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 47
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget v4, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/twocloo/com/cn/activitys/GuideActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 48
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->guide:I
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/GuideActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "tag"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->guide:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/GuideActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->viewPager:Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->views:Ljava/util/List;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "mParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/GuideActivity;->pics:[I
a=0;// 
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->views:Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {v3, p0, v4}, Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;-><init>(Lcom/twocloo/com/cn/activitys/GuideActivity;Ljava/util/List;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->vpAdapter:Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->viewPager:Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->vpAdapter:Lcom/twocloo/com/cn/activitys/GuideActivity$ViewPagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/beans/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 61
a=0;//     .local v1, "iv":Landroid/widget/ImageView;
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/GuideActivity;->pics:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 63
a=0;//     sget-object v3, Lcom/twocloo/com/cn/activitys/GuideActivity;->pics:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     if-ne v0, v3, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/GuideActivity$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/GuideActivity$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/activitys/GuideActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/GuideActivity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/GuideActivity$1;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->views:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 59
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/GuideActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 93
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     .line 196
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->lastX:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :pswitch_2
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->lastX:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     const/high16 v1, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->viewPager:Lcom/twocloo/com/cn/beans/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/ViewPager;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/GuideActivity;->views:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 200
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/GuideActivity;->goToApp()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
