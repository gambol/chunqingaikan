package android.support.v13.app; class FragmentTabHost { void a() { int a;
a=0;// .class public Landroid/support/v13/app/FragmentTabHost;
a=0;// .super Landroid/widget/TabHost;
a=0;// .source "FragmentTabHost.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v13/app/FragmentTabHost$1;,
a=0;//         Landroid/support/v13/app/FragmentTabHost$SavedState;,
a=0;//         Landroid/support/v13/app/FragmentTabHost$DummyTabFactory;,
a=0;//         Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAttached:Z
a=0;// 
a=0;// .field private mContainerId:I
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;// .field private mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;// .field private mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;// .field private mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private final mTabs:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v13/app/FragmentTabHost$TabInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v1}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Landroid/support/v13/app/FragmentTabHost;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0, p1, v1}, Landroid/support/v13/app/FragmentTabHost;->initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Landroid/support/v13/app/FragmentTabHost;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 128
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v13/app/FragmentTabHost;->initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doTabChanged(Ljava/lang/String;Landroid/app/FragmentTransaction;)Landroid/app/FragmentTransaction;
a=0;//     .locals 6
a=0;//     .param p1, "tabId"    # Ljava/lang/String;
a=0;//     .param p2, "ft"    # Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 311
a=0;//     .local v1, "newTab":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/support/v13/app/FragmentTabHost$TabInfo;);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     .line 313
a=0;//     .local v2, "tab":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     invoke-static {v2}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     .end local v2    # "tab":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 318
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "No tab known for tag "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 320
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v13/app/FragmentTabHost$TabInfo;);
a=0;//     if-eq v3, v1, :cond_6
a=0;// 
a=0;//     .line 321
a=0;//     if-nez p2, :cond_3
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 324
a=0;//     :cond_3
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Landroid/app/FragmentTransaction;->detach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .line 329
a=0;//     :cond_4
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 330
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$300(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$400(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v13/app/FragmentTabHost$TabInfo;Landroid/app/Fragment;)Landroid/app/Fragment;
a=0;// 
a=0;//     .line 333
a=0;//     iget v3, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2, v3, v4, v5}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .line 339
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-object v1, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     .line 341
a=0;//     :cond_6
a=0;//     return-object p2
a=0;// 
a=0;//     .line 335
a=0;//     :cond_7
a=0;//     #v3=(Reference,Landroid/app/Fragment;);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Landroid/app/FragmentTransaction;->attach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private ensureContent()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget v0, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v13/app/FragmentTabHost;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "No tab content FrameLayout found for id "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 11
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const v10, 0x1020013
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     #v6=(Null);
a=0;//     new-array v4, v9, [I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     const v5, 0x10100f3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aput v5, v4, v6
a=0;// 
a=0;//     invoke-virtual {p1, p2, v4, v6, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {p0, v10}, Landroid/support/v13/app/FragmentTabHost;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 143
a=0;//     .local v2, "ll":Landroid/widget/LinearLayout;
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v4, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v4, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v2, v4}, Landroid/support/v13/app/FragmentTabHost;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v3, Landroid/widget/TabWidget;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/TabWidget;);
a=0;//     invoke-direct {v3, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 149
a=0;//     .local v3, "tw":Landroid/widget/TabWidget;
a=0;//     #v3=(Reference,Landroid/widget/TabWidget;);
a=0;//     invoke-virtual {v3, v10}, Landroid/widget/TabWidget;->setId(I)V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/TabWidget;->setOrientation(I)V
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v4, v7, v5, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v1, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 156
a=0;//     .local v1, "fl":Landroid/widget/FrameLayout;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     const v4, 0x1020011
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setId(I)V
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v4, v6, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v1, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .end local v1    # "fl":Landroid/widget/FrameLayout;
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .restart local v1    # "fl":Landroid/widget/FrameLayout;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v1, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setId(I)V
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v5, 0x3f800000    # 1.0f
a=0;// 
a=0;//     invoke-direct {v4, v7, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 164
a=0;//     .end local v1    # "fl":Landroid/widget/FrameLayout;
a=0;//     .end local v2    # "ll":Landroid/widget/LinearLayout;
a=0;//     .end local v3    # "tw":Landroid/widget/TabWidget;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "tabSpec"    # Landroid/widget/TabHost$TabSpec;
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/TabHost$TabSpec;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Landroid/os/Bundle;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     .local p2, "clss":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     new-instance v3, Landroid/support/v13/app/FragmentTabHost$DummyTabFactory;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v13/app/FragmentTabHost$DummyTabFactory;);
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Landroid/support/v13/app/FragmentTabHost$DummyTabFactory;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v13/app/FragmentTabHost$DummyTabFactory;);
a=0;//     invoke-virtual {p1, v3}, Landroid/widget/TabHost$TabSpec;->setContent(Landroid/widget/TabHost$TabContentFactory;)Landroid/widget/TabHost$TabSpec;
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {p1}, Landroid/widget/TabHost$TabSpec;->getTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 218
a=0;//     .local v2, "tag":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v13/app/FragmentTabHost$TabInfo;);
a=0;//     invoke-direct {v1, v2, p2, p3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 220
a=0;//     .local v1, "info":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     #v1=(Reference,Landroid/support/v13/app/FragmentTabHost$TabInfo;);
a=0;//     iget-boolean v3, p0, Landroid/support/v13/app/FragmentTabHost;->mAttached:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/FragmentManager;);
a=0;//     invoke-virtual {v3, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v13/app/FragmentTabHost$TabInfo;Landroid/app/Fragment;)Landroid/app/Fragment;
a=0;// 
a=0;//     .line 225
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Fragment;->isDetached()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/FragmentManager;);
a=0;//     invoke-virtual {v3}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 227
a=0;//     .local v0, "ft":Landroid/app/FragmentTransaction;
a=0;//     #v0=(Reference,Landroid/app/FragmentTransaction;);
a=0;//     invoke-static {v1}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/app/FragmentTransaction;->detach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 232
a=0;//     .end local v0    # "ft":Landroid/app/FragmentTransaction;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v13/app/FragmentTabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {p0}, Landroid/support/v13/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 244
a=0;//     .local v0, "currentTab":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 245
a=0;//     .local v1, "ft":Landroid/app/FragmentTransaction;
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/app/FragmentTransaction;);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_3
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     .line 247
a=0;//     .local v3, "tab":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v13/app/FragmentTabHost$TabInfo;Landroid/app/Fragment;)Landroid/app/Fragment;
a=0;// 
a=0;//     .line 248
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/Fragment;->isDetached()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 253
a=0;//     iput-object v3, p0, Landroid/support/v13/app/FragmentTabHost;->mLastTab:Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/FragmentManager;);
a=0;//     invoke-virtual {v4}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 260
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v3}, Landroid/support/v13/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v13/app/FragmentTabHost$TabInfo;)Landroid/app/Fragment;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Fragment;);
a=0;//     invoke-virtual {v1, v4}, Landroid/app/FragmentTransaction;->detach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 267
a=0;//     .end local v3    # "tab":Landroid/support/v13/app/FragmentTabHost$TabInfo;
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Landroid/support/v13/app/FragmentTabHost;->mAttached:Z
a=0;// 
a=0;//     .line 268
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v13/app/FragmentTabHost;->doTabChanged(Ljava/lang/String;Landroid/app/FragmentTransaction;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 269
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v4, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/FragmentManager;);
a=0;//     invoke-virtual {v4}, Landroid/app/FragmentManager;->executePendingTransactions()Z
a=0;// 
a=0;//     .line 273
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 278
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v13/app/FragmentTabHost;->mAttached:Z
a=0;// 
a=0;//     .line 279
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v13/app/FragmentTabHost$SavedState;
a=0;// 
a=0;//     .line 292
a=0;//     .local v0, "ss":Landroid/support/v13/app/FragmentTabHost$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v13/app/FragmentTabHost$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v1, v0, Landroid/support/v13/app/FragmentTabHost$SavedState;->curTab:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v13/app/FragmentTabHost;->setCurrentTabByTag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 284
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v13/app/FragmentTabHost$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v13/app/FragmentTabHost$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v13/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 285
a=0;//     .local v0, "ss":Landroid/support/v13/app/FragmentTabHost$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentTabHost$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v13/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Landroid/support/v13/app/FragmentTabHost$SavedState;->curTab:Ljava/lang/String;
a=0;// 
a=0;//     .line 286
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onTabChanged(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "tabId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iget-boolean v1, p0, Landroid/support/v13/app/FragmentTabHost;->mAttached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v1}, Landroid/support/v13/app/FragmentTabHost;->doTabChanged(Ljava/lang/String;Landroid/app/FragmentTransaction;)Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "ft":Landroid/app/FragmentTransaction;
a=0;//     #v0=(Reference,Landroid/app/FragmentTransaction;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 304
a=0;//     .end local v0    # "ft":Landroid/app/FragmentTransaction;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v13/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TabHost$OnTabChangeListener;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v1, p0, Landroid/support/v13/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iput-object p1, p0, Landroid/support/v13/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setup()V
a=0;//     .locals 2
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Must call setup() that takes a Context and FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setup(Landroid/content/Context;Landroid/app/FragmentManager;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "manager"    # Landroid/app/FragmentManager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->setup()V
a=0;// 
a=0;//     .line 179
a=0;//     iput-object p1, p0, Landroid/support/v13/app/FragmentTabHost;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 180
a=0;//     iput-object p2, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     .line 181
a=0;//     invoke-direct {p0}, Landroid/support/v13/app/FragmentTabHost;->ensureContent()V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setup(Landroid/content/Context;Landroid/app/FragmentManager;I)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "manager"    # Landroid/app/FragmentManager;
a=0;//     .param p3, "containerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     invoke-super {p0}, Landroid/widget/TabHost;->setup()V
a=0;// 
a=0;//     .line 186
a=0;//     iput-object p1, p0, Landroid/support/v13/app/FragmentTabHost;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 187
a=0;//     iput-object p2, p0, Landroid/support/v13/app/FragmentTabHost;->mFragmentManager:Landroid/app/FragmentManager;
a=0;// 
a=0;//     .line 188
a=0;//     iput p3, p0, Landroid/support/v13/app/FragmentTabHost;->mContainerId:I
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Landroid/support/v13/app/FragmentTabHost;->ensureContent()V
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v0, p0, Landroid/support/v13/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setId(I)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {p0}, Landroid/support/v13/app/FragmentTabHost;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const v0, 0x1020012
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v13/app/FragmentTabHost;->setId(I)V
a=0;// 
a=0;//     .line 197
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
