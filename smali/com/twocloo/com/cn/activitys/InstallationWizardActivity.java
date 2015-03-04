package com.twocloo.com.cn.activitys; class InstallationWizardActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;
a=0;// .super Landroid/support/v4/app/FragmentActivity;
a=0;// .source "InstallationWizardActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
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
a=0;// .field private viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 36
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->nstallationwizard_activity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 37
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->install_viewPager:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/SelectSexFragment;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/SelectSexFragment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/fragment/SelectSexFragment;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/SelectSexFragment;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/SelectBookFragment;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/SelectBookFragment;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/fragment/SelectBookFragment;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/SelectBookFragment;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, v2}, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;-><init>(Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->adapter:Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->adapter:Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$InstallAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;->viewPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/InstallationWizardActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/InstallationWizardActivity$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
}}
