package com.handmark.pulltorefresh.library; class PullToRefreshListView { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// .super Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;
a=0;// .source "PullToRefreshListView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;,
a=0;//         Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListViewSDK9;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase",
a=0;//         "<",
a=0;//         "Landroid/widget/ListView;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;// .field private mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;// .field private mListViewExtrasEnabled:Z
a=0;// 
a=0;// .field private mLvFooterLoadingFrame:Landroid/widget/FrameLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "style":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;)Landroid/widget/FrameLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mLvFooterLoadingFrame:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected createListView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ListView;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListViewSDK9;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListViewSDK9;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListViewSDK9;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 212
a=0;//     .local v0, "lv":Landroid/widget/ListView;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 210
a=0;//     .end local v0    # "lv":Landroid/widget/ListView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;-><init>(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .restart local v0    # "lv":Landroid/widget/ListView;
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected createLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;//     .locals 3
a=0;//     .param p1, "includeStart"    # Z
a=0;//     .param p2, "includeEnd"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-super {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->createLoadingLayoutProxy(ZZ)Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     .local v1, "proxy":Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;);
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mListViewExtrasEnabled:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1, v2}, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->addLayout(Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;)V
a=0;// 
a=0;//     .line 197
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {v1, v2}, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->addLayout(Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;)V
a=0;// 
a=0;//     .line 202
a=0;//     .end local v0    # "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected createRefreshableView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ListView;
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->createListView(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "lv":Landroid/widget/ListView;
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     const v1, 0x102000a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setId(I)V
a=0;// 
a=0;//     .line 221
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getPullToRefreshScrollDirection()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected handleStyledAttributes(Landroid/content/res/TypedArray;)V
a=0;//     .locals 7
a=0;//     .param p1, "a"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 226
a=0;//     #v5=(One);
a=0;//     invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->handleStyledAttributes(Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     .line 228
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v2, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mListViewExtrasEnabled:Z
a=0;// 
a=0;//     .line 230
a=0;//     iget-boolean v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mListViewExtrasEnabled:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 232
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 231
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V
a=0;// 
a=0;//     .line 235
a=0;//     .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     new-instance v0, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 236
a=0;//     .local v0, "frame":Landroid/widget/FrameLayout;
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {p0, v2, v3, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v2, Landroid/widget/ListView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v0, v3, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v2, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mLvFooterLoadingFrame:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 242
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     invoke-virtual {p0, v2, v3, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mLvFooterLoadingFrame:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 250
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setScrollingWhileRefreshingEnabled(Z)V
a=0;// 
a=0;//     .line 254
a=0;//     .end local v0    # "frame":Landroid/widget/FrameLayout;
a=0;//     .end local v1    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRefreshing(Z)V
a=0;//     .locals 9
a=0;//     .param p1, "doScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     #v8=(Null);
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     iget-boolean v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mListViewExtrasEnabled:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getShowViewWhileRefreshing()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->onRefreshing(Z)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 77
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     invoke-super {p0, v8}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->onRefreshing(Z)V
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v7}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     packed-switch v6, :pswitch_data_0
a=0;// 
a=0;//     .line 93
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getHeaderLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 94
a=0;//     .local v3, "origLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 95
a=0;//     .local v1, "listViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 96
a=0;//     .local v2, "oppositeListViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     .local v5, "selection":I
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getScrollY()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getHeaderSize()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     add-int v4, v6, v7
a=0;// 
a=0;//     .line 102
a=0;//     .local v4, "scrollToY":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     invoke-virtual {v3}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->reset()V
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {v3}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->hideAllViews()V
a=0;// 
a=0;//     .line 106
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {v1, v8}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->refreshing()V
a=0;// 
a=0;//     .line 112
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->disableLoadingLayoutVisibilityChanges()V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {p0, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setHeaderScroll(I)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p0, v8}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->smoothScrollTo(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     .end local v1    # "listViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .end local v2    # "oppositeListViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .end local v3    # "origLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .end local v4    # "scrollToY":I
a=0;//     .end local v5    # "selection":I
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getFooterLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 86
a=0;//     .restart local v3    # "origLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v1    # "listViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 88
a=0;//     .restart local v2    # "oppositeListViewLoadingView":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v5, v6, -0x1
a=0;// 
a=0;//     .line 89
a=0;//     .restart local v5    # "selection":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getScrollY()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getFooterSize()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     sub-int v4, v6, v7
a=0;// 
a=0;//     .line 90
a=0;//     .restart local v4    # "scrollToY":I
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onReset()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     #v2=(One);
a=0;//     iget-boolean v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mListViewExtrasEnabled:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->onReset()V
a=0;// 
a=0;//     .line 185
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Null);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v7}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aget v5, v5, v7
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 154
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getHeaderLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "originalLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mHeaderLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "listViewLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getHeaderSize()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     neg-int v3, v5
a=0;// 
a=0;//     .line 157
a=0;//     .local v3, "scrollToHeight":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     .local v4, "selection":I
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/ListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, v4
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-gt v5, v2, :cond_3
a=0;// 
a=0;//     .line 164
a=0;//     .local v2, "scrollLvToEdge":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v4=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->showInvisibleViews()V
a=0;// 
a=0;//     .line 170
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getState()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     sget-object v6, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;->MANUAL_REFRESHING:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;
a=0;// 
a=0;//     #v6=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$State;);
a=0;//     if-eq v5, v6, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v5, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {p0, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setHeaderScroll(I)V
a=0;// 
a=0;//     .line 184
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->onReset()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     .end local v0    # "listViewLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .end local v1    # "originalLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .end local v2    # "scrollLvToEdge":Z
a=0;//     .end local v3    # "scrollToHeight":I
a=0;//     .end local v4    # "selection":I
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getFooterLayout()Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v1    # "originalLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mFooterLoadingView:Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 148
a=0;//     .restart local v0    # "listViewLoadingLayout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/ListView;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v4, v5, -0x1
a=0;// 
a=0;//     .line 149
a=0;//     .restart local v4    # "selection":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->getFooterSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 150
a=0;//     .restart local v3    # "scrollToHeight":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/ListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, v4
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-gt v5, v2, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v2    # "scrollLvToEdge":Z
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v2    # "scrollLvToEdge":Z
a=0;//     :cond_2
a=0;//     #v2=(One);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 150
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(One);v4=(Null);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 158
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
