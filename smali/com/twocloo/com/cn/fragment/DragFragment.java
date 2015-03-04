package com.twocloo.com.cn.fragment; class DragFragment { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "DragFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ValidFragment"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private adapter:Lcom/twocloo/com/cn/adapters/DragListViewAdapter;
a=0;// 
a=0;// .field private listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;// .field private type:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "type"    # I
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ValidFragment"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->type:I
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->drag_pullToRefreshListView:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->my_drag_fragment:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/com/cn/fragment/DragFragment;->initView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v1, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/adapters/DragListViewAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/fragment/DragFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/adapters/DragListViewAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/DragListViewAdapter;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->adapter:Lcom/twocloo/com/cn/adapters/DragListViewAdapter;
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->adapter:Lcom/twocloo/com/cn/adapters/DragListViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/DragFragment;->listView:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/fragment/DragFragment$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/fragment/DragFragment$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/fragment/DragFragment$1;-><init>(Lcom/twocloo/com/cn/fragment/DragFragment;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment$1;);
a=0;//     invoke-virtual {v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 47
a=0;//     return-object v0
a=0;// .end method
}}
