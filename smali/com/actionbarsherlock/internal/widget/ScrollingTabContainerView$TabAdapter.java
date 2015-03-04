package com.actionbarsherlock.internal.widget; class ScrollingTabContainerView$TabAdapter { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "TabAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;-><init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->access$0(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->access$0(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/IcsLinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->getTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->access$1(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;Lcom/actionbarsherlock/app/ActionBar$Tab;Z)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 497
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .line 495
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/app/ActionBar$Tab;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$TabView;->bindTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
