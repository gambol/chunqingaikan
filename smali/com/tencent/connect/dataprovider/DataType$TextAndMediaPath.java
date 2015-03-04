package com.tencent.connect.dataprovider; class DataType$TextAndMediaPath { void a() { int a;
a=0;// .class public Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/dataprovider/DataType;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "TextAndMediaPath"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath$1;);
a=0;//     invoke-direct {v0}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath$1;);
a=0;//     sput-object v0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Lcom/tencent/connect/dataprovider/DataType$1;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;);
a=0;//     iput-object p1, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     iput-object p2, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMediaPath()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/connect/dataprovider/DataType$TextAndMediaPath;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
}}
