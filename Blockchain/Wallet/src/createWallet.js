const BIP32 = require('bip32');
const BIP39 = require('bip39');
const BITCOIN = require('bitcoinjs-lib');

const NETWORK = BITCOIN.networks.testnet;

const PATH = `m/49'/1'/0'/0`;

let mnemonic = BIP39.generateMnemonic();
const SEED = BIP39.mnemonicToSeedSync(mnemonic);

let root = BIP32.fromSeed(SEED, NETWORK);

let account = root.derivePath(PATH);
let node = account.derive(0).derive(0);

let btcAddress = BITCOIN.payments.p2pkh({
    pubkey: node.publicKey,
    network: NETWORK,

}).address;

console.log("Generated!!")
console.log("Address: ", btcAddress);
console.log("Private Key: ", node.toWIF());
console.log("Seed: ", mnemonic);