package com.actionbarsherlock.internal.widget; class IcsAdapterView$SelectionNotifier { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsAdapterView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "SelectionNotifier"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 817
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 817
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;-><init>(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 819
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     iget-boolean v0, v0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->mDataChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 824
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 829
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 827
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsAdapterView$SelectionNotifier;->this$0:Lcom/actionbarsherlock/internal/widget/IcsAdapterView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsAdapterView;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsAdapterView;->access$2(Lcom/actionbarsherlock/internal/widget/IcsAdapterView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
