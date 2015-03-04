package com.twocloo.com.cn.fragment; class BookCityFragment$MyOnPageChangeListener { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookCityFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "MyOnPageChangeListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPageScrollStateChanged(I)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageScrolled(IFI)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # I
a=0;//     .param p2, "arg1"    # F
a=0;//     .param p3, "arg2"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageSelected(I)V
a=0;//     .locals 4
a=0;//     .param p1, "selectIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 337
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$10(Lcom/twocloo/com/cn/fragment/BookCityFragment;)[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$11(Lcom/twocloo/com/cn/fragment/BookCityFragment;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$10(Lcom/twocloo/com/cn/fragment/BookCityFragment;)[I
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget v2, v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v0, v1, v2, v3, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     .line 341
a=0;//     .local v0, "animation":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1, p1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$12(Lcom/twocloo/com/cn/fragment/BookCityFragment;I)V
a=0;// 
a=0;//     .line 342
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 343
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$13(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$MyOnPageChangeListener;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->load()V
a=0;// 
a=0;//     .line 347
a=0;//     return-void
a=0;// .end method
}}
