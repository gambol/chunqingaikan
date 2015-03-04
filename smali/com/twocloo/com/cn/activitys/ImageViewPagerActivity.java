package com.twocloo.com.cn.activitys; class ImageViewPagerActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;
a=0;// .super Landroid/support/v4/app/FragmentActivity;
a=0;// .source "ImageViewPagerActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/ImagePageAdapter;
a=0;// 
a=0;// .field private fragments:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private list:[I
a=0;// 
a=0;// .field private movie_id:Ljava/lang/String;
a=0;// 
a=0;// .field private position:I
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// .field private viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 28
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->usercentericon:I
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->list:[I
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 45
a=0;//     #v4=(One);
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {p0, v4}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 47
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->activity_image_view_pager:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v2, "position"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->position:I
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v2, Lcom/twocloo/com/cn/adapters/ImagePageAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/adapters/ImagePageAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2, v3, v4}, Lcom/twocloo/com/cn/adapters/ImagePageAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/ImagePageAdapter;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->adapter:Lcom/twocloo/com/cn/adapters/ImagePageAdapter;
a=0;// 
a=0;//     .line 53
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->image_viewpager:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v2, 0xf
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->adapter:Lcom/twocloo/com/cn/adapters/ImagePageAdapter;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->position:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v2=(PosByte);v3=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/MovieImageFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/MovieImageFragment;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->list:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     rem-int/lit8 v5, v0, 0x5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget v4, v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4, v5}, Lcom/twocloo/com/cn/fragment/MovieImageFragment;-><init>(ILandroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/MovieImageFragment;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 55
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V
a=0;// 
a=0;//     .line 86
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageScrollStateChanged(I)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageScrolled(IFI)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # I
a=0;//     .param p2, "arg1"    # F
a=0;//     .param p3, "arg2"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ImageViewPagerActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/animation/CubeTransformer;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/animation/CubeTransformer;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/animation/CubeTransformer;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/animation/CubeTransformer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageSelected(I)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
