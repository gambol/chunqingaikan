package com.twocloo.com.cn.adapters; class ListViewNewAdapt { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ListViewNewAdapt.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;,
a=0;//         Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;// .field public handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public lastIndex:I
a=0;// 
a=0;// .field private listener:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;// 
a=0;// .field private onOrOff:Z
a=0;// 
a=0;// .field public vlist:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/Handler;Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/util/Vector;)V
a=0;//     .locals 1
a=0;//     .param p1, "handler"    # Landroid/os/Handler;
a=0;//     .param p2, "context"    # Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/os/Handler;",
a=0;//             "Lcom/twocloo/com/cn/fragment/BookShelfFragment;",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     .local p3, "vlist":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->lastIndex:I
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->onOrOff:Z
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->vlist:Ljava/util/Vector;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iput-boolean p1, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->onOrOff:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->onOrOff:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->downBook(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;)Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->listener:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private doset(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx1:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 433
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->updatenumber_:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 434
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx2:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 435
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 436
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->menu_imageview:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 437
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bottom_linearlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bottom_linearlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 438
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bookshelf_book:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bookshelf_book:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 439
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->iv_bsdh:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bsdh:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 442
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->button_left:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     .line 443
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->button_middle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     .line 444
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->button_right:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_right:Landroid/widget/Button;
a=0;// 
a=0;//     .line 445
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->menu_linearlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_linearlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 454
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_img1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 498
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private downBook(I)V
a=0;//     .locals 2
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 400
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 401
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 403
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private listener(I)Landroid/view/View$OnClickListener;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$4;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$4;-><init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$4;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->vlist:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
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
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->vlist:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
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
a=0;//     .line 62
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 17
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-direct {v9, v13}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;-><init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;)V
a=0;// 
a=0;//     .line 69
a=0;//     .local v9, "item":Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$layout;->bookshelf_row_new:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 70
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 72
a=0;//     .end local v9    # "item":Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v9=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;// 
a=0;//     .line 73
a=0;//     .restart local v9    # "item":Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v0, v9, v1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->doset(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;Landroid/view/View;)V
a=0;// 
a=0;//     .line 75
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->vlist:Ljava/util/Vector;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/Vector;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v13, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 76
a=0;//     .local v2, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     .local v8, "isDowning":Z
a=0;//     #v8=(Null);
a=0;//     sget-object v13, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_4
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v13, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     .line 79
a=0;//     .local v6, "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     iget-wide v13, v6, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     long-to-float v10, v13
a=0;// 
a=0;//     .line 80
a=0;//     .local v10, "max":F
a=0;//     #v10=(Float);
a=0;//     iget-wide v13, v6, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     long-to-float v11, v13
a=0;// 
a=0;//     .line 81
a=0;//     .local v11, "min":F
a=0;//     #v11=(Float);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bsdh:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bsdh:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     check-cast v13, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/graphics/drawable/AnimationDrawable;->start()V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 84
a=0;//     sget-object v13, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "min:"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "max:"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     float-to-double v13, v10
a=0;// 
a=0;//     #v13=(DoubleLo);v14=(DoubleHi);
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     cmpg-double v13, v13, v15
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-gtz v13, :cond_3
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v14, "1 %"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 91
a=0;//     :goto_0
a=0;//     #v15=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 100
a=0;//     .end local v6    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .end local v10    # "max":F
a=0;//     .end local v11    # "min":F
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v8=(Boolean);v10=(Conflicted);v11=(Conflicted);v16=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_1
a=0;// 
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "100 %"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bsdh:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 103
a=0;//     const/16 v13, 0x8
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setIsonDown(I)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v14, "\u5c1a\u672a\u9605\u8bfb"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getIsUp()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     if-ne v13, v14, :cond_5
a=0;// 
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v14, "  \u66f4\u65b0  "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lez v13, :cond_2
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "\u7ae0\u66f4\u65b0"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->listener(I)Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->listener(I)Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_right:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->listener(I)Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_linearlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v14, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$1;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v14, v0, v1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$1;-><init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;I)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$1;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction2:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bottom_linearlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 195
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->lastIndex:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-eq v13, v14, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->lastIndex:I
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v13, :cond_d
a=0;// 
a=0;//     .line 196
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-boolean v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->onOrOff:Z
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_c
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bottom_linearlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction1:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 207
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 208
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v13, v14, v15}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 209
a=0;//     .local v12, "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_12
a=0;// 
a=0;//     .line 211
a=0;//     if-eqz v12, :cond_11
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ltz v13, :cond_11
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     if-nez v13, :cond_e
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     if-lez v13, :cond_e
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 231
a=0;//     :goto_4
a=0;//     #v15=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     if-eqz v13, :cond_13
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 262
a=0;//     :goto_5
a=0;//     #v4=(Conflicted);v5=(Conflicted);v14=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_16
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 267
a=0;//     :goto_6
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_17
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx2:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "\u4f5c\u8005\uff1a"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 273
a=0;//     :goto_7
a=0;//     #v15=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v14, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$2;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v14, v0, v2, v1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$2;-><init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$2;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bookshelf_book:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v14, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v14, v0, v2, v1}, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;-><init>(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$3;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 376
a=0;//     return-object p2
a=0;// 
a=0;//     .line 89
a=0;//     .end local v12    # "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .restart local v6    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .restart local v10    # "max":F
a=0;//     .restart local v11    # "min":F
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/View;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v7=(Uninit);v8=(Null);v10=(Float);v11=(Float);v12=(Uninit);v13=(Byte);v14=(DoubleHi);v15=(LongLo);v16=(LongHi);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/high16 v15, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     mul-float/2addr v15, v11
a=0;// 
a=0;//     #v15=(Float);
a=0;//     div-float/2addr v15, v10
a=0;// 
a=0;//     float-to-int v15, v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, " %"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 94
a=0;//     .end local v6    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .end local v10    # "max":F
a=0;//     .end local v11    # "min":F
a=0;//     :cond_4
a=0;//     #v6=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bsdh:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 96
a=0;//     const/16 v13, 0x8
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setIsonDown(I)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->updatenumber:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);v8=(Boolean);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(One);v16=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .local v7, "i":I
a=0;//     :goto_8
a=0;//     #v3=(Conflicted);v7=(Integer);v13=(Conflicted);v14=(Conflicted);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-ge v7, v13, :cond_2
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v13, :cond_6
a=0;// 
a=0;//     const-string v13, ""
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_7
a=0;// 
a=0;//     .line 125
a=0;//     :cond_6
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     sget-object v13, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_9
a=0;// 
a=0;//     .line 126
a=0;//     sget-object v13, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     check-cast v13, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_7
a=0;//     #v13=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/common/Util;->readBook(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 147
a=0;//     .local v3, "bookFile":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_a
a=0;// 
a=0;//     .line 148
a=0;//     :cond_8
a=0;//     #v13=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg_press:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v14, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 154
a=0;//     const-string v13, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 128
a=0;//     .end local v3    # "bookFile":Ljava/io/File;
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);v13=(Boolean);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg_press:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v14, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 134
a=0;//     const-string v13, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 135
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg_press:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d\u4e2d"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d\u4e2d"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 158
a=0;//     .restart local v3    # "bookFile":Ljava/io/File;
a=0;//     :cond_a
a=0;//     #v3=(Reference,Ljava/io/File;);v13=(Boolean);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getIsdelete()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-eqz v13, :cond_b
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     const-string v14, "\u5df2\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg_press:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_middle:Landroid/widget/Button;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction_bg:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 165
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->button_left:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d\u4e2d"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v14, "\u4e0b\u8f7d\u4e2d"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_b
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 200
a=0;//     .end local v3    # "bookFile":Ljava/io/File;
a=0;//     .end local v7    # "i":I
a=0;//     :cond_c
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);v1=(Integer);v3=(Conflicted);v7=(Conflicted);v13=(Boolean);v14=(Byte);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bottom_linearlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->menu_imageview:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->bookshelf_bookaction2:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/ImageView;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 205
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v13=(Integer);v14=(Byte);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->bottom_linearlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 216
a=0;//     .restart local v12    # "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_e
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;);v12=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v13=(Integer);v14=(Reference,Ljava/lang/String;);v15=(PosByte);
a=0;//     iget-object v14, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     if-nez v13, :cond_f
a=0;// 
a=0;//     const-string v13, "\u5df2\u8bfb\u5b8c"
a=0;// 
a=0;//     :goto_9
a=0;//     #v13=(Reference,Ljava/lang/String;);v15=(Conflicted);
a=0;//     invoke-virtual {v14, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-nez v13, :cond_10
a=0;// 
a=0;//     const-string v13, "\u5df2\u8bfb\u5b8c"
a=0;// 
a=0;//     :goto_a
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 216
a=0;//     :cond_f
a=0;//     #v13=(Integer);v15=(PosByte);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 217
a=0;//     :cond_10
a=0;//     #v13=(Integer);v15=(Conflicted);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 221
a=0;//     :cond_11
a=0;//     #v13=(Integer);v15=(PosByte);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v14, "\u5c1a\u672a\u9605\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 222
a=0;//     const-string v13, "\u5c1a\u672a\u9605\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 228
a=0;//     :cond_12
a=0;//     #v13=(Boolean);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx3:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 233
a=0;//     :cond_13
a=0;//     #v15=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     if-eqz v13, :cond_15
a=0;// 
a=0;//     const-string v13, ""
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_15
a=0;// 
a=0;//     .line 236
a=0;//     new-instance v13, Ljava/io/File;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v13}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_14
a=0;// 
a=0;//     .line 239
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     new-instance v14, Ljava/io/File;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v14}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 238
a=0;//     #v14=(Null);
a=0;//     invoke-static {v13, v14}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 240
a=0;//     .local v4, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setBookDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v13, v4}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 242
a=0;//     .end local v4    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 243
a=0;//     .local v5, "e":Ljava/io/FileNotFoundException;
a=0;//     #v5=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {v5}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13, v5}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 248
a=0;//     .end local v5    # "e":Ljava/io/FileNotFoundException;
a=0;//     :cond_14
a=0;//     :try_start_1
a=0;//     #v4=(Uninit);v5=(Uninit);v13=(Boolean);v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Lcom/twocloo/com/cn/task/DownLoadImageTask;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     iget-object v15, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/Button;);
a=0;//     invoke-direct {v13, v14, v2, v15}, Lcom/twocloo/com/cn/task/DownLoadImageTask;-><init>(Landroid/content/Context;Lcom/twocloo/com/cn/beans/BFBook;Landroid/widget/Button;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     new-array v14, v14, [Ljava/lang/Void;
a=0;// 
a=0;//     #v14=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v13, v14}, Lcom/twocloo/com/cn/task/DownLoadImageTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 254
a=0;//     :catch_1
a=0;//     #v13=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 255
a=0;//     .local v5, "e":Ljava/lang/Exception;
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13, v5}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 260
a=0;//     .end local v5    # "e":Ljava/lang/Exception;
a=0;//     :cond_15
a=0;//     #v5=(Uninit);v13=(Conflicted);v14=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->btn1:Landroid/widget/Button;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/Button;);
a=0;//     sget v14, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 265
a=0;//     :cond_16
a=0;//     #v4=(Conflicted);v5=(Conflicted);v13=(Boolean);v14=(Conflicted);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v14, "\u4f5c\u54c1\u66f4\u65b0\u4e2d"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 270
a=0;//     :cond_17
a=0;//     #v13=(Boolean);
a=0;//     iget-object v13, v9, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$GalleryListItem;->tx2:Landroid/widget/TextView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v14, "\u4f5c\u8005\uff1a\u6682\u65e0"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 502
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 503
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getGobookcityBtn()Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 509
a=0;//     :goto_0
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 510
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->flushLastReadHistory()V
a=0;// 
a=0;//     .line 511
a=0;//     return-void
a=0;// 
a=0;//     .line 506
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getGobookcityBtn()Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 507
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ListViewNewAdapt;->listener:Lcom/twocloo/com/cn/adapters/ListViewNewAdapt$onItemClickListener;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
}}
