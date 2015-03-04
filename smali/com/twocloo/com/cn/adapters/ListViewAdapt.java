package com.twocloo.com.cn.adapters; class ListViewAdapt { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/adapters/ListViewAdapt;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ListViewAdapt.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public booklist:Ljava/util/Vector;
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
a=0;// .field public context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;// .field public handler:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/Handler;Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/util/Vector;)V
a=0;//     .locals 0
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
a=0;//     .line 44
a=0;//     .local p3, "vlist":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/adapters/ListViewAdapt;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->downBook(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doset(Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
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
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookname:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 349
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
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookname:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 350
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
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookname:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 351
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t11:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 352
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t22:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 353
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_t33:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 355
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_d1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 356
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_d2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 357
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_d3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 359
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_up1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateLeftImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 360
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_up2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateMiddleImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 361
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_up3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateRightImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 363
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
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverLeftBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 364
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_img2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverMiddleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 365
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_img3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverRightBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 367
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yly1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookLeftLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 368
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yly2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookMiddleLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 369
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yly3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookRightLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 371
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yy1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownLeftyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 372
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yy2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownMiddleyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 373
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_yy3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownRightyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 375
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_pro1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 376
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_pro2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 377
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->bfitem_pro3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookname:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookname:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookname:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookstatus:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverLeftBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 387
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverMiddleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookCoverRightBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdeletelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdeletelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdeletelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookdeleteImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateLeftImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateMiddleImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookUpdateRightImg:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookLeftLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookMiddleLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookRightLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdownlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownLeftyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdownlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownMiddleyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdownlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookDownRightyybg:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->leftbookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->middlebookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v0, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->rightbookpb:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 410
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private downBook(I)V
a=0;//     .locals 2
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 321
a=0;//     .local v0, "msg":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput p1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 322
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 324
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v1, v2, 0x3
a=0;// 
a=0;//     .line 53
a=0;//     .local v1, "whole":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v2}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int/lit8 v0, v2, 0x3
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "mod":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .end local v1    # "whole":I
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     .restart local v1    # "whole":I
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
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
a=0;//     .locals 19
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v10, "item":Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     #v10=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;// 
a=0;//     .end local v10    # "item":Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-direct {v10, v15}, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;-><init>(Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;)V
a=0;// 
a=0;//     .line 81
a=0;//     .restart local v10    # "item":Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v15}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     sget v16, Lcom/twocloo/com/cn/R$layout;->bookshelf_row:I
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     invoke-virtual/range {v15 .. v17}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 82
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v0, v10, v1}, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->doset(Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;Landroid/view/View;)V
a=0;// 
a=0;//     .line 83
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 86
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .local v9, "isDowning":Z
a=0;//     #v9=(Null);
a=0;//     mul-int/lit8 v2, p1, 0x3
a=0;// 
a=0;//     .line 88
a=0;//     .local v2, "begin":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v18=(Conflicted);
a=0;//     const/4 v15, 0x3
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     if-lt v8, v15, :cond_1
a=0;// 
a=0;//     .line 309
a=0;//     return-object p2
a=0;// 
a=0;//     .line 85
a=0;//     .end local v2    # "begin":I
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "isDowning":Z
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .end local v10    # "item":Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;// 
a=0;//     .restart local v10    # "item":Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     .restart local v2    # "begin":I
a=0;//     .restart local v8    # "i":I
a=0;//     .restart local v9    # "isDowning":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Null);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(PosByte);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v15}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int v16, v2, v8
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v15, v0, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdeletelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdownlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 98
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     rem-int/lit8 v15, v15, 0x3
a=0;// 
a=0;//     if-ne v8, v15, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     sget v16, Lcom/twocloo/com/cn/R$drawable;->addbookbutton:I
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v16, Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;
a=0;// 
a=0;//     #v16=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;-><init>(Lcom/twocloo/com/cn/adapters/ListViewAdapt;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;);v16=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$1;);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 88
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 111
a=0;//     :cond_3
a=0;//     #v0=(Integer);v15=(Integer);v16=(Integer);
a=0;//     add-int v11, v2, v8
a=0;// 
a=0;//     .line 112
a=0;//     .local v11, "p":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->booklist:Ljava/util/Vector;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v15, v11}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 114
a=0;//     .local v3, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getId()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     const-wide/16 v17, -0x1
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     cmp-long v15, v15, v17
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-eqz v15, :cond_a
a=0;// 
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_a
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setIsonDown(I)V
a=0;// 
a=0;//     .line 116
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     .line 118
a=0;//     .local v7, "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     sget-object v15, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v16, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v17, "min:"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-wide v0, v7, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(LongLo);
a=0;//     invoke-virtual/range {v16 .. v18}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     const-string v17, "max:"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     iget-wide v0, v7, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(LongLo);
a=0;//     invoke-virtual/range {v16 .. v18}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     iget-wide v15, v7, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     long-to-double v15, v15
a=0;// 
a=0;//     #v15=(DoubleLo);v16=(DoubleHi);
a=0;//     const-wide/16 v17, 0x0
a=0;// 
a=0;//     cmpg-double v15, v15, v17
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-gtz v15, :cond_9
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v16, 0x64
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ProgressBar;->setMax(I)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ProgressBar;->setProgress(I)V
a=0;// 
a=0;//     .line 127
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v16=(Integer);v17=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 131
a=0;//     .end local v7    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v7=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     .line 132
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_4
a=0;//     #v15=(Conflicted);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v16, 0x8
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsUp()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v15, v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     if-lez v15, :cond_5
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 139
a=0;//     :cond_5
a=0;//     #v15=(Conflicted);v16=(Boolean);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 144
a=0;//     .local v13, "t":Landroid/widget/TextView;
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsUp()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ne v15, v0, :cond_b
a=0;// 
a=0;//     if-nez v9, :cond_b
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getUpdatenumber()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     if-lez v15, :cond_b
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookupdatelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 158
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     #v15=(Conflicted);v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Lcom/twocloo/com/cn/common/Util;->readBook(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 159
a=0;//     .local v4, "bookFile":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_8
a=0;// 
a=0;//     .line 160
a=0;//     :cond_7
a=0;//     #v15=(Conflicted);
a=0;//     const-string v15, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 161
a=0;//     const-string v15, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     :cond_8
a=0;//     #v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getTb()Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     const/16 v17, 0x2
a=0;// 
a=0;//     #v17=(PosByte);
a=0;//     invoke-virtual/range {v15 .. v17}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 166
a=0;//     .local v12, "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v13}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_12
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_10
a=0;// 
a=0;//     .line 168
a=0;//     if-eqz v12, :cond_f
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ltz v15, :cond_f
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     if-nez v15, :cond_e
a=0;// 
a=0;//     const-string v15, "\u5df2\u8bfb\u5b8c"
a=0;// 
a=0;//     :goto_6
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     :goto_7
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     if-eqz v15, :cond_14
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getBookDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 215
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookstatueslist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_17
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 224
a=0;//     :goto_9
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsdelete()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 225
a=0;//     .local v14, "vis":I
a=0;//     #v14=(Integer);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdeletelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v15, v14}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookdownlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getIsonDown()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlayoutlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v16, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;
a=0;// 
a=0;//     #v16=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);
a=0;//     invoke-direct {v0, v1, v3, v11}, Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;-><init>(Lcom/twocloo/com/cn/adapters/ListViewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;);v16=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$2;);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v16, Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;
a=0;// 
a=0;//     #v16=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-direct {v0, v1, v3, v11}, Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;-><init>(Lcom/twocloo/com/cn/adapters/ListViewAdapt;Lcom/twocloo/com/cn/beans/BFBook;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;);v16=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt$3;);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 124
a=0;//     .end local v4    # "bookFile":Ljava/io/File;
a=0;//     .end local v12    # "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .end local v13    # "t":Landroid/widget/TextView;
a=0;//     .end local v14    # "vis":I
a=0;//     .restart local v7    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_9
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Conflicted);v7=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Byte);v16=(DoubleHi);v17=(LongLo);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iget-wide v0, v7, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     move-wide/from16 v0, v16
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ProgressBar;->setMax(I)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->pblist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iget-wide v0, v7, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(LongLo);
a=0;//     move-wide/from16 v0, v16
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/ProgressBar;->setProgress(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 129
a=0;//     .end local v7    # "f":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_a
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);v1=(Conflicted);v7=(Conflicted);v15=(Byte);v16=(Conflicted);v17=(LongLo);
a=0;//     const/16 v15, 0x8
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setIsonDown(I)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v13    # "t":Landroid/widget/TextView;
a=0;//     :cond_b
a=0;//     #v0=(One);v13=(Reference,Landroid/widget/TextView;);v15=(Integer);v16=(One);v17=(Conflicted);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v15, :cond_c
a=0;// 
a=0;//     const-string v15, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_6
a=0;// 
a=0;//     .line 148
a=0;//     :cond_c
a=0;//     #v15=(Conflicted);v16=(Conflicted);
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_d
a=0;// 
a=0;//     .line 149
a=0;//     sget-object v15, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 151
a=0;//     :cond_d
a=0;//     #v15=(Boolean);
a=0;//     const-string v15, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v15, "\u5c1a\u672a\u4e0b\u8f7d"
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 169
a=0;//     .restart local v4    # "bookFile":Ljava/io/File;
a=0;//     .restart local v12    # "queryLastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_e
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);v4=(Reference,Ljava/io/File;);v12=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v15=(Integer);v17=(PosByte);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/RDBook;->getIndex_()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 172
a=0;//     :cond_f
a=0;//     #v15=(Integer);
a=0;//     const-string v15, "\u5c1a\u672a\u9605\u8bfb"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 173
a=0;//     const-string v15, "\u5c1a\u672a\u9605\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v3, v15}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 176
a=0;//     :cond_10
a=0;//     #v15=(Boolean);
a=0;//     const-string v15, "0\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_11
a=0;// 
a=0;//     .line 177
a=0;//     const-string v15, "\u5df2\u8bfb\u5b8c"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 179
a=0;//     :cond_11
a=0;//     #v15=(Boolean);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 183
a=0;//     :cond_12
a=0;//     #v15=(Boolean);
a=0;//     const-string v15, "0\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_13
a=0;// 
a=0;//     .line 184
a=0;//     const-string v15, "\u5df2\u8bfb\u5b8c"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 186
a=0;//     :cond_13
a=0;//     #v15=(Boolean);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getLastIndex()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 191
a=0;//     :cond_14
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     if-eqz v15, :cond_16
a=0;// 
a=0;//     const-string v15, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_16
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v15, Ljava/io/File;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v15}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_15
a=0;// 
a=0;//     .line 196
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     new-instance v16, Ljava/io/File;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/io/File;);
a=0;//     invoke-static/range {v16 .. v16}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     #v16=(Null);
a=0;//     invoke-static/range {v15 .. v16}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 197
a=0;//     .local v5, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v3, v5}, Lcom/twocloo/com/cn/beans/BFBook;->setBookDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v15, v5}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 199
a=0;//     .end local v5    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 200
a=0;//     .local v6, "e":Ljava/io/IOException;
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     sget v16, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v15, v6}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 205
a=0;//     .end local v6    # "e":Ljava/io/IOException;
a=0;//     :cond_15
a=0;//     :try_start_1
a=0;//     #v6=(Conflicted);v15=(Boolean);v16=(Reference,Ljava/lang/String;);v17=(PosByte);
a=0;//     new-instance v16, Lcom/twocloo/com/cn/task/DownLoadImageTask;
a=0;// 
a=0;//     #v16=(UninitRef,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v0, v1, v3, v15}, Lcom/twocloo/com/cn/task/DownLoadImageTask;-><init>(Landroid/content/Context;Lcom/twocloo/com/cn/beans/BFBook;Landroid/widget/Button;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/DownLoadImageTask;);v16=(Reference,Lcom/twocloo/com/cn/task/DownLoadImageTask;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     new-array v15, v15, [Ljava/lang/Void;
a=0;// 
a=0;//     #v15=(Reference,[Ljava/lang/Void;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Lcom/twocloo/com/cn/task/DownLoadImageTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 206
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 207
a=0;//     .local v6, "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     sget v16, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v15, v6}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 212
a=0;//     .end local v6    # "e":Ljava/lang/Exception;
a=0;//     :cond_16
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/ListViewAdapt;);v6=(Conflicted);v15=(Conflicted);v16=(Reference,Ljava/lang/String;);v17=(PosByte);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->bookcoverlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/Button;
a=0;// 
a=0;//     sget v16, Lcom/twocloo/com/cn/R$drawable;->default_cover:I
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 221
a=0;//     :cond_17
a=0;//     #v0=(Conflicted);v15=(Boolean);v16=(Null);v17=(Conflicted);
a=0;//     iget-object v15, v10, Lcom/twocloo/com/cn/adapters/ListViewAdapt$GalleryListItem;->booknamelist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     check-cast v15, Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v16, "\u4e8c\u5c42\u697c\u4f5c\u54c1"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getGobookcityBtn()Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
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
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getGobookcityBtn()Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/ListViewAdapt;->context:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
